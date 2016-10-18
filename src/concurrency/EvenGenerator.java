package concurrency;

/**
 * Created by wangbiwen on 16-9-12.
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
