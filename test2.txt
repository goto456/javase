package net.mindview.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile extends ArrayList<String> {
  public static String read(String fileName) {
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader in = new BufferedReader(new FileReader(
          new File(fileName).getAbsoluteFile()));
      try {
        String s;
        while ((s = in.readLine()) != null) {
          sb.append(s);
          sb.append("\n");
        }
      } finally {
        // TODO: handle exception
        in.close();
      }
    } catch (IOException e) {
      // TODO: handle exception
      throw new RuntimeException(e);
    }
    return sb.toString();
  }
  
  public static void write(String fileName, String text) {
    try {
      PrintWriter out = new PrintWriter(
          new File(fileName).getAbsoluteFile());
      try {
        out.print(text);
      } finally {
        out.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public TextFile(String fileName, String spliter) {
    super(Arrays.asList(read(fileName).split(spliter)));
    if ("".equals(get(0))) {
      remove(0);
    }
  }
  
  public TextFile(String fileName) {
    this(fileName, "\n");
  }
  
  public void write(String fileName) {
    try {
      PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
      try {
        for (String item : this) {
          out.println(item);
        } 
      } finally {
        out.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  public static void main(String[] args) {
    String file = read("src\\net\\mindview\\util\\TextFile.java");
    write("test.txt", file);
    TextFile text = new TextFile("test.txt");
    text.write("test2.txt");
    
  }

}
