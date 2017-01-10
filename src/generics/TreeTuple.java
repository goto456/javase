package generics;

/**
 * FileName: TreeTuple.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-12-23
 */
public class TreeTuple<A, B, C> extends TwoTuple {
    public final C c;

    public TreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}
