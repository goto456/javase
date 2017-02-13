package generics;

import util.Generator;

/**
 * FileName: Fabonacci.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-4
 */
public class Fabonacci implements Generator<Integer> {
    private int count = 0;

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fabonacci fabonacci = new Fabonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(fabonacci.next());
        }
    }
}
