package concurrency;

/**
 * Created by biwen on 16-8-31.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
