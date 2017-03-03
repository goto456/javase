package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
  private static Random rand = new Random(47);
  private static final char[] capitals = "ABCDEFG".toCharArray();
  private static final char[] lowers = "abcdefg".toCharArray();
  private static final char[] vowels = "aeiou".toCharArray();
  private int count;
  
  public RandomWords(int count) {
    this.count = count;
  }
  
  public int read(CharBuffer cb) {
    if (count-- == 0) {
      return -1;
    }
    cb.append(capitals[rand.nextInt(capitals.length)]);
    for (int i = 0; i < 4; i++) {
      cb.append(lowers[rand.nextInt(lowers.length)]);
      cb.append(vowels[rand.nextInt(vowels.length)]);
    }
    cb.append(" ");
    return 10;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(new RandomWords(5));
    while (scanner.hasNext()) {
      System.out.println(scanner.next());
    }
  }
}
