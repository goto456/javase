package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: FilledListMaker.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker = new FilledListMaker<>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.print(list);
    }
}
