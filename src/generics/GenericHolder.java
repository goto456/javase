package generics;

/**
 * FileName: GenericHolder.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class GenericHolder<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Item");
        String s = holder.get();
        System.out.print(s);
    }
}
