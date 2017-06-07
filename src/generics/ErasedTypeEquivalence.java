package generics;

import java.util.ArrayList;

/**
 * FileName: ErasedTypeEquivalence.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-17
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);
    }
}
