package generics;

import util.BasicGenerator;
import util.Generator;

/**
 * FileName: BasicGeneratorDemo.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-9
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        Generator<CountedObject> gen2 = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen2.next());
        }
    }
}
