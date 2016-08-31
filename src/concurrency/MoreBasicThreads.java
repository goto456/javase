package concurrency;

/**
 * Created by biwen on 16-8-31.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i =0; i < 5; i++) {
            new Thread(new LiftOff()).start();

        }
        System.out.println("Waiting for lifg off...");
    }
}
