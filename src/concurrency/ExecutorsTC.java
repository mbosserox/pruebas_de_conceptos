package concurrency;

import java.util.concurrent.*;

public class ExecutorsTC {
    static ExecutorService executor =  Executors.newSingleThreadExecutor();
    public static void main(String[] args) {

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
    }
}
