package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortCut {
  private static String file = "FileOutputShortCut.out";
  
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(
        new StringReader(
            BufferedInputFile.read("src\\io\\FileOutputShortCut.java")));
    PrintWriter out = new PrintWriter(file);
    String s;
    int lineCount = 1;
    while ((s = in.readLine()) != null) {
      System.out.println(lineCount++ + ": " + s);
    }
    out.close();
    
    System.out.println(BufferedInputFile.read(file));
  }
}
