package semaphore;

public class SemaphoreTaskExecutor {
    private static SemaphoreTaskExample semaphoreTaskExample = new SemaphoreTaskExample();

    public void execute() {
        Thread t1 = new Thread(
                () -> {
                    semaphoreTaskExample.execute();
                }
        );

        Thread t2 = new Thread(
                () -> {
                    semaphoreTaskExample.execute();
                }
        );

        try {
            t1.start();
            Thread.sleep(1000);
            t2.start();
        } catch (Exception e) {

        }
    }
}
