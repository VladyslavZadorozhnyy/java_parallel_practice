import monitor.MonitorTaskExecutor;
import mutex.MutexTaskExample;
import mutex.MutexTaskExecutor;
import semaphore.SemaphoreTaskExecutor;

public class Main {
    public static void main(String[] args) {
        new MutexTaskExecutor().executeSync();
    }
}
