package generics;

/**
 * FileName: TwoTuple.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-12-23
 */
public class TwoTuple<A, B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
