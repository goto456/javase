package concurrency;

/**
 * Created by wangbiwen on 16-9-8.
 */

class InnerThread1 {
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) {
                        return;
                    }
                    sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
        }
        public String toString() {
            return getName() + ": " + countDown;
        }
    }

    public InnerThread1(String name) {
        inner = new Inner(name);
    }
}

class InnerThread2 {
    private int countDown = 5;
    private Thread thread;

    public InnerThread2(String name) {
        thread = new Thread(name) {
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("interruputed.");

                }
            }

            public String toString() {
                return getName() + ": " + countDown;
            }
        };

        thread.start();
    }
}

class ThreadMethod {
    private int countDown = 5;
    private Thread thread;
    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (thread == null) {
            thread = new Thread(name) {
                public void run() {
                    try {
                        while (true) {
                            System.out.println(this);
                            if (--countDown == 0)
                                return;
                            sleep(10);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted.");
                    }
                }
                public String toString() {
                    return getName() + ": " + countDown;
                }
            };

            thread.start();
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
//        new InnerThread1("InnerThread1");
//        new InnerThread2("InnerThread2");
        new ThreadMethod("ThreadMethod").runTask();
    }
}
