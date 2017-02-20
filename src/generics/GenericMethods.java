package generics;

/**
 * FileName: GenericMethods.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public void g(Object o) {
        System.out.println(o.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        gm.g("");
        gm.g(1);
        gm.g(gm);
    }
}
