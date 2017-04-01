package generics;

import util.Generator;

import java.util.*;

/**
 * FileName: OceanFish.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-17
 */
public class OceanFish {
    public static void eat(BigFish bigFish, LittleFish littleFish) {
        System.out.println(bigFish + " eat " + littleFish);
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        Set<LittleFish> littleFishs = new HashSet<>();
        Generators.fill(littleFishs, LittleFish.generator(), 15);

        List<BigFish> bigFishs = new ArrayList<>();
        Generators.fill(bigFishs, BigFish.generator(), 4);

        for (LittleFish littleFish : littleFishs) {
            eat(bigFishs.get(random.nextInt(bigFishs.size())), littleFish);
        }
    }
}

class BigFish {
    private static int counter = 0;
    private final int id = counter++;

    private BigFish() {

    }

    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish {
    private static int counter = 0;
    private final int id = counter++;

    private LittleFish() {

    }

    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
