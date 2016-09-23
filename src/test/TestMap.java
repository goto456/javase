package test;

import java.util.HashMap;

/**
 * Created by wangbiwen on 16-9-20.
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "张三");
        map.put("age", "18");
        System.out.println(map.toString());
    }
}
