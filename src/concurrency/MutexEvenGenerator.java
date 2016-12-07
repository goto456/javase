package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangbiwen on 16-9-21.
 */
public class MutexEvenGenerator extends IntGenerator {
    private int currentValue = 0;
    private Lock lock = new ReentrantLock();

    public int next() {
        lock.lock();
        try {
            ++currentValue;
            Thread.yield();
            ++currentValue;
            return currentValue;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }

}
