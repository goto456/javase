package concurrency;

/**
 * Created by biwen on 16-9-6.
 */
public class RunnableDemo implements Runnable {
    private String startMessage = null;
    private String stopMessage = null;

    public RunnableDemo(String startMessage, String stopMessage) {
        this.startMessage = startMessage;
        this.stopMessage = stopMessage;
    }

    public void run() {
        System.out.println(this + startMessage + " start...");
        for (int i = 0; i < 3; i++) {
            System.out.println("hello " + i);
            Thread.yield();
        }
        System.out.println(this + stopMessage + " stop...");
    }

    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo("aaa", "bbb");
        for (int i = 0; i < 15; i++){
            new Thread(demo).start();
        }


    }
}
