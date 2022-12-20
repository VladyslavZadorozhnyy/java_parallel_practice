package mutex;

import java.util.concurrent.locks.ReentrantLock;

public class MutexTaskExample {
    private int nonStaticValue = 0;
    private ReentrantLock lock = new ReentrantLock();
    private final Object monitor = new Object();

    public void executeNonSync() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            nonStaticValue += 10;
            System.out.println("Thread name: " + threadName + " value: " + nonStaticValue);
        }
    }

    public void executeSync() {
        if (!lock.isLocked()) {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                String threadName = Thread.currentThread().getName();
                nonStaticValue += 10;
                System.out.println("Thread name: " + threadName + " value: " + nonStaticValue);
            }
            lock.unlock();
        } else {
            while (true) {
                if (!lock.isLocked()) {
                    executeSync();
                    return ;
                }
            }
        }
    }
}
