package generics;

/**
 * FileName: GenericMethods3.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */
public class GenericMethods3 {
    public <A, B> void f(A a, String name, B b) {
        System.out.println("A: " + a.getClass().getSimpleName() + ", name: " + name + ", B: " + b.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods3 gm3 = new GenericMethods3();
        gm3.f(1.0, "Hello", gm3);
    }
}
