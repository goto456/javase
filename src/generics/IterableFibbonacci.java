package generics;

import java.util.Iterator;

/**
 * FileName: IterableFibbonacci.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-4
 */
public class IterableFibbonacci extends Fabonacci implements Iterable<Integer> {
    private int n;

    public IterableFibbonacci(int n) {
        this.n = n;
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
                return IterableFibbonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibbonacci iterableFibbonacci = new IterableFibbonacci(18);
        for (int i : iterableFibbonacci) {
            System.out.println(i);
        }
    }
}
