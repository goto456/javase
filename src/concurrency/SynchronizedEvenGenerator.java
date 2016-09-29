package concurrency;

/**
 * Created by wangbiwen on 16-9-13.
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentValue = 0;

    public synchronized int next() {
        ++currentValue;
        Thread.yield();
        ++currentValue;
        return currentValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
