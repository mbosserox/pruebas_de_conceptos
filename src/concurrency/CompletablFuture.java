package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletablFuture {

    CompletableFuture<String> completableFuture = new CompletableFuture();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = (CompletableFuture<String>) CompletableFuture.supplyAsync(sayHelloAsync());
        CompletableFuture<String> totalStringFuture;
        CompletableFuture<String> lambdaApplyAsyc= CompletableFuture.supplyAsync( () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Lambda apply asyc");
            return "Lambda apply asyc ";
        });
        totalStringFuture = lambdaApplyAsyc.thenApply( lamda ->  sayHelloAsync()+ lamda);
        System.out.println(totalStringFuture.get());
    }

    public static Supplier<String> sayHelloAsync(){
        return  new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("sayHelloAsync");
                return "sayHelloAsync";
            }
        };
    }
}
