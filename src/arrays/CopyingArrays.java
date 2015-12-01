package arrays;

import java.util.Arrays;

/**
 * Title: CopyingArrays
 * Description: 
 * @author Aven Wang
 * @date 2015年12月1日 下午6:53:49
 * @version 1.0
 */
public class CopyingArrays {
  public static void main(String[] args) {
    int[] i = new int[7];
    int[] j = new int[10];
    Arrays.fill(i, 47);
    Arrays.fill(j, 99);
    System.out.println(Arrays.toString(i));
    System.out.println(Arrays.toString(j));
    
    System.arraycopy(i, 0, j, 2, i.length);
    System.out.println(Arrays.toString(j));
    
    int[] k = new int[5];
    Arrays.fill(k, 103);
    System.arraycopy(i, 0, k, 0, k.length);
    System.out.println(Arrays.toString(k));
    
    Arrays.fill(k, 103);
    System.arraycopy(k, 0, i, 0, k.length);
    System.out.println(Arrays.toString(i));
    
  }
}
