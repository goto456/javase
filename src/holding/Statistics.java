package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
  public static void main(String[] args) {
    Random rand = new Random(47);
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < 1000000; i++) {
      int value = rand.nextInt(30);
      Integer integer = map.get(value);
      map.put(value, integer == null ? 1 : integer + 1);
    }
    System.out.println(map);
  }
}
