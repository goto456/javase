package util;

import generics.TreeTuple;
import generics.TwoTuple;

/**
 * FileName: Tuple.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-9
 */
public class Tuple {
    public static <A, B> TwoTuple tuple(A a, B b) {
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> TreeTuple tuple(A a, B b, C c) {
        return new TreeTuple(a, b, c);
    }
}
