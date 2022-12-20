package monitor;

public class MonitorTaskExecutor {
    private static MonitorTaskExample monitorStaticTaskExample = new MonitorTaskExample();
    private MonitorTaskExample monitorTaskExample = new MonitorTaskExample();

    public void executeNonSync() {
        Thread t1 = new Thread(
                () -> {
                    monitorTaskExample.executeNonSync();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    monitorTaskExample.executeNonSync();
                }
        );

        t1.start();
        t2.start();
    }

    public void executeSync() {
        Thread t1 = new Thread(
                () -> {
                    monitorTaskExample.executeSync();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    monitorTaskExample.executeSync();
                }
        );

        t1.start();
        t2.start();
    }

    public static void executeSyncStatic() {
        Thread t1 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncStatic();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncStatic();
                }
        );

        t1.start();
        t2.start();
    }

    public static void executeSyncStaticMonitor() {
        Thread t1 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncStaticMonitor();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncStaticMonitor();
                }
        );

        t1.start();
        t2.start();
    }

    public static void executeSyncMonitor() {
        Thread t1 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncMonitor();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    monitorStaticTaskExample.executeSyncMonitor();
                }
        );

        t1.start();
        t2.start();
    }
}
