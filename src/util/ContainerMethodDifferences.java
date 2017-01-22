package util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * FileName: ContainerMethodDifferences.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-16
 */
public class ContainerMethodDifferences {
    public static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<>();
        for (Method m : type.getMethods()) {
            result.add(m.getName());
        }
        return result;
    }

    public static void interfaces(Class<?> type) {
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<>();
        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    public static Set<String> object = methodSet(Objects.class);

    static {
        object.add("clone");
    }

    public static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));

        interfaces(Collection.class);

        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
    }
}
