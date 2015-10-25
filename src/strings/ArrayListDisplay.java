package strings;

import java.util.ArrayList;

public class ArrayListDisplay {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    for (String s : "My name is Wang Biwen".split(" ")) {
      strings.add(s);
    }
    System.out.println(strings);
  }
}
