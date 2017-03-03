package concurrency;

/**
 * Created by wangbiwen on 16-9-28.
 */

class CircleSet {
    private int[] array;
    private int len;
    private int index = 0;

    public CircleSet(int size) {
        this.array = new int[size];
        this.len = size;
        for (int i = 0; i < size; i ++) {
            array[i] = -1;
        }
    }

    public synchronized void add(int i) {
        array[index] = i;
        index = ++index % len;
    }

    public synchronized boolean contains(int val) {
        for (int i = 0; i < len; i++) {
            if (array[i] == val) {
                return true;
            }
        }
        return false;
    }

}

public class SerialNumberChecker {
}
