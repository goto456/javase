package generics;

import util.New;

import java.util.List;
import java.util.Map;

/**
 * FileName: SimplerPets.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */
public class SimplerPets {
    public static void main(String[] args) {
        Map<String, List<? extends Object>> test = New.map();
    }
}
