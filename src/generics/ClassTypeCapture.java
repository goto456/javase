package generics;

import java.util.Map;

/**
 * FileName: ClassTypeCapture.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-18
 */
public class ClassTypeCapture<T> {
    Class<T> kind;
    Map<String, Class<?>> kindMap;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Class<?> kind) {
        kindMap.put(typename, kind);
    }

    public Object createNew(String typename) {
        Object result = null;
        try {
            result =  kindMap.get(typename).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}

class Building {

}

class House extends Building {

}
