package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseInputFile {
  public static String reverseFile(String filename) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(filename));
    List<String> strList = new LinkedList<String>();
    String s;
    while ((s = in.readLine()) != null) {
      strList.add(s);
    }
    Collections.reverse(strList);
    StringBuilder sb = new StringBuilder();
    for (String str : strList) {
      sb.append(str + "\n");
    }
    return sb.toString();
  }
  
  public static void main(String[] args) throws IOException {
    System.out.println(reverseFile("src\\io\\ReverseInputFile.java"));
  }
}
