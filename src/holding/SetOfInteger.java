package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
  public static void main(String[] args) {
    Set<Integer> intSet = new HashSet<Integer>();
    Random rand = new Random(47);
    for (int i = 0; i < 10; i++) {
      intSet.add(rand.nextInt(30));
    }
    System.out.println(intSet);
  }
}
