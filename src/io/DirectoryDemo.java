package io;

import java.io.File;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

public class DirectoryDemo {
  public static void main(String[] args) {
    PPrint.pprint(Directory.walk(".").dirs);
    for (File file : Directory.local(".", "T.*")) {
      System.out.println(file);
    }
    System.out.println("--------------------");
    for (File file : Directory.local(".", "T.*\\.java")) {
      System.out.println(file);
    }
  }
}
