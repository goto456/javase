package concurrency;

/**
 * Created by biwen on 16-8-31.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for lift off...");
    }
}
