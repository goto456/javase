package test;

import java.io.File;

public class Test {
  private String name = "wang";
  public String getName() {
    return name;
  }
  
  public static void main(String[] args) {
    File dir = new File(".\\src" + File.separator + "");
    System.out.println(dir.exists());
  }
}

