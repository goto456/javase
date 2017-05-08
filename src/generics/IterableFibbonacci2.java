package generics;

import java.util.Iterator;

/**
 * FileName: IterableFibbonacci2.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-4
 */
public class IterableFibbonacci2 implements Iterable<Integer> {
    private Fabonacci fabonacci;
    private int n;

    public IterableFibbonacci2(int n) {
        this.n = n;
        fabonacci = new Fabonacci();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fabonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibbonacci2(18)) {
            System.out.println(i);
        }
    }
}
