package concurrency;

import java.util.Arrays;

/**
 * Created by biwen on 16-9-6.
 */
public class ExcTwo implements Runnable {
    private final int n;

    public ExcTwo(int n) {
        this.n = n;

    }

    public int getFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return getFib(n - 1) + getFib(n - 2);
        }
    }

    public int[] getFibArray() {
        int fibs[] = new int[n];
        for (int i = 0; i < n; i ++) {
            fibs[i] = getFib(i + 1);
        }
        return fibs;
    }

    public void run() {
        System.out.format("Fibo of %d: %s\n", n, Arrays.toString(getFibArray()));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ExcTwo(i + 1)).start();
        }
    }
}
