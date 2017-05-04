package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: ListMaker.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        List<String> stringList = stringMaker.create();
    }
}
