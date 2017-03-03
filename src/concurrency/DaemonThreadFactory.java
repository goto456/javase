package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by wangbiwen on 16-9-7.
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
