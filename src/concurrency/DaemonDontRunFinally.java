package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangbiwen on 16-9-7.
 */

class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon.");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException.");
        } finally {
            System.out.println("This should always run?");
        }
    }
}

public class DaemonDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new ADaemon());
        thread.setDaemon(true);
        thread.start();
        //TimeUnit.SECONDS.sleep(1);
    }
}
