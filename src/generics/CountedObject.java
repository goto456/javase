package generics;

/**
 * FileName: CountedObject.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-9
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject: " + id;
    }
}
