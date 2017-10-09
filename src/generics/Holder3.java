package generics;

/**
 * FileName: Holder3.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-12-22
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.getA();
//        h3.setA("test");
    }
}
