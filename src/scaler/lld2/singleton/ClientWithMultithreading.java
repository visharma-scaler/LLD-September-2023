package scaler.lld2.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientWithMultithreading {
    public static void main(String[] args) {

        Set<DatabaseConnection> databaseConnections = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100000; i++) {
            executorService.submit(() -> databaseConnections.add(DatabaseConnection.getInstance()));
        }

        System.out.println("Size is: " + databaseConnections.size());

        executorService.shutdown();

    }
}
