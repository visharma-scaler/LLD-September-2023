package scaler.lld1.exceptionHandling;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("A", "B");
        System.out.println(pair);


//        Pair<String, String> nullPair = new Pair<>(null, null);
//        // .
//        // .
//        // .
//        System.out.println(nullPair);

        try {
            String greet = caller();
            System.out.println(greet);
        } catch (InterruptedException | ExecutionException e) {
            // Handling of Errors
            System.out.println("Exception Handled");
        }

    }

    private static String caller() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> resultFuture = executorService.submit(() -> "Hello Everyone");
        executorService.awaitTermination(1, TimeUnit.MICROSECONDS);

        executorService.shutdown();

        return resultFuture.get();
    }
}
