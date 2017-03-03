package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangbiwen on 16-9-7.
 */
class Daemon implements Runnable {
    private Thread[] threads = new Thread[10];

    public void run() {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new DaemonSpawn());
            threads[i].start();
            System.out.println("DaemonSpawn " + i + " started.");
        }
        for(int i = 0; i < threads.length; i++) {
            System.out.println("t[" + i + "].isDaemon() = " + threads[i].isDaemon());
        }
        while (true) {
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {
    public void run() {
        while(true) {
            Thread.yield();
        }
    }
}

public class Daemons {
    public static void main(String[] args) {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
