package arrays;

import java.util.Random;

/**
 * Title: CompType
 * Description: 
 * @author Aven Wang
 * @date 2015年12月1日 下午8:15:25
 * @version 1.0
 */
public class CompType implements Comparable<CompType> {
  int i;
  int j;
  private static int count = 1;
  
  public CompType(int n1, int n2) {
    this.i = n1;
    this.j = n2;
  }
  
  public String toString() {
    String result = "[i = " + i + ", j = " + j + "]";
    if (count++ % 3 == 0) {
      result += "\n";
    }
    return result;
  }
  
  public int compareTo(CompType rv) {
    return (i < rv.i ? -1 : (j == rv.j ? 0 : 1));
  }
  
  private static Random r = new Random(47);
  
  
}
