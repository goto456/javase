package generics;

/**
 * FileName: GenericMethods2.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */

public class GenericMethods2 {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.println("1: " + a.getClass().getSimpleName());
        System.out.println("2: " + b.getClass().getSimpleName());
        System.out.println("3: " + c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods2 gm2 = new GenericMethods2();
        gm2.f("", 1.0, gm2);
    }
}
