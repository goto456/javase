package concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangbiwen on 16-9-7.
 */
public class ExcSix implements Runnable {
    private static int initNum = 0;
    private final int id = initNum ++;
    private int sleepSeconds;

    public ExcSix(int n) {
        this.sleepSeconds = n;
    }

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepSeconds);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("id " + id + " hava slept for " + sleepSeconds + " seconds.");
    }

    public static void main(String[] args) {
        Random random = new Random();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new ExcSix(random.nextInt(11)));
        }
        executorService.shutdown();
    }
}
