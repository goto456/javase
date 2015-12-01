package arrays;

import java.util.Arrays;

/**
 * Title: ComparingArrays
 * Description: 
 * @author Aven Wang
 * @date 2015年12月1日 下午7:08:57
 * @version 1.0
 */
public class ComparingArrays {
  public static void main(String[] args) {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 47);
    Arrays.fill(a2, 47);
    System.out.println(Arrays.equals(a1, a2));
    System.out.println(a1.equals(a2));
    
    
  }
}
