package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangbiwen on 16-9-7.
 */
public class SleepingTask extends LiftOff {
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Interupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService executionException = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executionException.execute(new SleepingTask());
        }
        executionException.shutdown();
    }
}
