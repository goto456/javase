package concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by wangbiwen on 16-9-7.
 */
public class ExcFive implements Callable<String> {
    private final int n;

    public ExcFive(int n) {
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
        int[] fibs = new int[n];
        for (int i = 0; i < n; i++) {
            fibs[i] = getFib(i + 1);
        }
        return fibs;
    }

    @Override
    public String call() {
        int[] fibs = getFibArray();
        int sum = 0;
        for (int i = 0; i < fibs.length; i++) {
            sum += fibs[i];
        }
        return "sum of the fibs is " + sum;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 5; i++) {
            results.add(executorService.submit(new ExcFive(i + 1)));
        }
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }
        }
        executorService.shutdown();
    }
}
