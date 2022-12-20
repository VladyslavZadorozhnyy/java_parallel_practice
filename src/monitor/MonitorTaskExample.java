package monitor;

public class MonitorTaskExample {
    private static int staticValue = 0;
    private int nonStaticValue = 0;

    private final Object monitor = new Object();

    public void executeNonSync() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            nonStaticValue += 10;
            System.out.println("Thread name: " + threadName + " value: " + nonStaticValue);
        }
    }

    public synchronized void executeSync() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            nonStaticValue += 10;
            System.out.println("Thread name: " + threadName + " value: " + nonStaticValue);
        }
    }

    public static synchronized void executeSyncStatic() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            staticValue += 10;
            System.out.println("Thread name: " + threadName + " value: " + staticValue);
        }
    }

    public static void executeSyncStaticMonitor() {
        synchronized (MonitorTaskExample.class) {
            for (int i = 0; i < 10; i++) {
                String threadName = Thread.currentThread().getName();
                staticValue += 10;
                System.out.println("Thread name: " + threadName + " value: " + staticValue);
            }
        }
    }

    public void executeSyncMonitor() {
        synchronized (monitor) {
            for (int i = 0; i < 10; i++) {
                String threadName = Thread.currentThread().getName();
                staticValue += 10;
                System.out.println("Thread name: " + threadName + " value: " + staticValue);
            }
        }
    }
}
