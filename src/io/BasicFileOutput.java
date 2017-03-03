package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
  private static String file = "BasicFileOutput.out";
  
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new StringReader(
        BufferedInputFile.read("src\\io\\BasicFileOutput.java")));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
    String s;
    int lineCount = 1;
    while ((s = in.readLine()) != null) {
      System.out.println(lineCount++ + ": " + s);      
    }
    out.close();
    in.close();
    System.out.println(BufferedInputFile.read(file));
  }
}
