package concurrency;

/**
 * Created by wangbiwen on 16-9-9.
 */

class UnresponsiveUi {
    private volatile double d = 1;
    public UnresponsiveUi() throws Exception {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }
}

public class ResponsiveUI extends Thread {
    private static volatile double d = 1;
    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }

    }

    public static void main(String[] args) throws Exception {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
