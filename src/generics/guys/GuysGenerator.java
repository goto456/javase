package generics.guys;

import util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * FileName: GuysGenerator.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-4
 */
public class GuysGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Class[] types = {GoodGuys.class, BadGuys.class};
    private Random random = new Random(47);
    private int n;

    public GuysGenerator(int n) {
        this.n = n;
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public StoryCharacters next() {
                n--;
                return GuysGenerator.this.next();
            }
        };
    }

    @Override
    public StoryCharacters next() {
        int index = random.nextInt(100);
        index %= 2;
        try {
            return (StoryCharacters) types[index].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        for (StoryCharacters character : new GuysGenerator(10)) {
            System.out.println(character);
        }
    }
}
