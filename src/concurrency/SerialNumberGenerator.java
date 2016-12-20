package concurrency;

/**
 * Created by wangbiwen on 16-9-28.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber() {
        return serialNumber++;
    }
}
