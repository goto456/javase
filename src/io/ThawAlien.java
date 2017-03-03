package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ThawAlien {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("X.file"));
    Object alien = in.readObject();
    System.out.println(alien.getClass());
  }
}
