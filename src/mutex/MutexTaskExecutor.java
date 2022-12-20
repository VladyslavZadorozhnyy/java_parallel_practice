package mutex;

import monitor.MonitorTaskExample;

public class MutexTaskExecutor {
    private MutexTaskExample mutexTaskExample = new MutexTaskExample();

    public void executeSync() {
        Thread t1 = new Thread(
                () -> {
                    mutexTaskExample.executeSync();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    mutexTaskExample.executeSync();
                }
        );

        t1.start();
        t2.start();
    }

    public void executeNonSync() {
        Thread t1 = new Thread(
                () -> {
                    mutexTaskExample.executeNonSync();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    mutexTaskExample.executeNonSync();
                }
        );

        t1.start();
        t2.start();
    }
}
