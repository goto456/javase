package generics;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * FileName: Generators.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-6
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fabonacci(), 12);
        for (int i : fnumbers) {
            System.out.println(i);
        }
    }
}
