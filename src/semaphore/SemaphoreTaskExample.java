package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTaskExample {
    private Semaphore semaphore = new Semaphore(5);

    public void execute() {
        if (Thread.currentThread().getName().equals("Thread-0")) {
            try {
                semaphore.acquire();
                System.out.println("Thread-0 acquired semaphore");
            } catch (Exception e) {
                System.out.println("Thread-0 acquired exception");
            } finally {
                System.out.println("Thread-0 releases semaphore");
            }
            System.out.println("Thread-0 finished");
        } else if (Thread.currentThread().getName().equals("Thread-1")) {
            try {
                System.out.println("Thread-1 waits for semaphore");
                Thread.sleep(4000);
                semaphore.release();
                System.out.println("Thread-1 released semaphore");
            } catch (Exception e) {
                System.out.println("Thread-1 acquired exception");
            } finally {
                System.out.println("Thread-1 finished");
            }
        }
    }
}
