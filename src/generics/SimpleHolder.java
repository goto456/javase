package generics;

/**
 * FileName: SimpleHolder.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class SimpleHolder {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
    }
}
