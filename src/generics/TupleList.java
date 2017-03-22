package generics;

import java.util.ArrayList;

/**
 * FileName: TupleList.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-17
 */
public class TupleList<A, B> extends ArrayList<TwoTuple<A, B>> {
    public static void main(String[] args) {
        TupleList<String, Integer> t1 = new TupleList<>();
        t1.add(TupleTest.f());
        t1.add(TupleTest.f());

        for (TwoTuple<String, Integer> i : t1) {
            System.out.println(i);
        }
    }
}
