import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Shutdown_ex_for_two_tasks {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit two tasks
        for (int i = 1; i <= 2; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                    System.out.println("✅ Task done by " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Task interrupted");
                }
            });
        }

        // Initiate shutdown
        executor.shutdown();
        System.out.println("🔒 Executor shutdown called.");

        try {
            // Wait for tasks to finish (max 5 seconds wait)
            if (executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("🔚 All tasks completed.");
            } else {
                System.out.println("⚠️ Timeout! Some tasks may still be running.");
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }
    }
}


