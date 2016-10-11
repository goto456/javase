package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangbiwen on 16-9-7.
 */
public class ExcThree {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new RunnableDemo("abc", "xyz"));
        }
        executorService.shutdown();
    }
}
