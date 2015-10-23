package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOfOperations {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<String>();
    Set<String> set2 = new HashSet<String>();
    Collections.addAll(set1, "A B C D E F G".split(" "));
    Collections.addAll(set2, "E F G H".split(" "));
    System.out.println("A in set1: " + set1.contains("A"));
    System.out.println("M in set1: " + set1.contains("M"));
    System.out.println("set2 in set1: " + set1.containsAll(set2));
    set2.remove("H");
    System.out.println("set2 in set1: " + set1.containsAll(set2));
    set2.add("M");
    set1.removeAll(set2);
    System.out.println("set2 removed from set1: " + set1);
  }
}
