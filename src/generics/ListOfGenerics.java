package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: ListOfGenerics.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-19
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
