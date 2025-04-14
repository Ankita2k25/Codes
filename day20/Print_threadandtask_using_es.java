import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Print_threadandtask_using_es {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        Runnable task1 = () -> System.out.println(" Task 1 is running on: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println(" Task 2 is running on: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println(" Task 3 is running on: " + Thread.currentThread().getName());
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.shutdown();
    }
}
