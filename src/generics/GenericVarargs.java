package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: GenericVarargs.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(GenericVarargs.makeList("a", "b", "C"));
        System.out.println(GenericVarargs.makeList(1,2,3,4,45,5));
    }
}
