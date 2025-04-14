import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sum_in_callable {
    public static void main(String[] args) throws Exception {
        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a Callable that calculates the sum from 1 to 100
        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            return sum;
        };

        // Submit the task and get a Future to retrieve the result
        Future<Integer> future = executor.submit(sumTask);

        // Get the result (waits if necessary)
        int result = future.get();
        System.out.println("✅ Sum from 1 to 10 is: " + result);

        // Shutdown the executor
        executor.shutdown();
    }
}

