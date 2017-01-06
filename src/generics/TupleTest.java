package generics;

/**
 * FileName: TupleTest.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-12-23
 */

class Amphibian {

}

class Vehicle {

}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static TreeTuple<Amphibian, String, Integer> g () {
        return new TreeTuple<>(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);

        System.out.println(g());
    }
}
