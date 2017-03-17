package generics;

import static util.Tuple.tuple;

/**
 * FileName: TupleTest2.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-9
 */
public class TupleTest2 {
    public static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    public static TwoTuple f2() {
        return tuple("hi", 47);
    }

    public static TreeTuple g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
    }
}
