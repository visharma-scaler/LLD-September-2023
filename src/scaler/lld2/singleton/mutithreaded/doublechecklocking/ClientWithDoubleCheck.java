package scaler.lld2.singleton.mutithreaded.doublechecklocking;


import scaler.lld2.singleton.mutithreaded.DatabaseConnectionWithLocks;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientWithDoubleCheck {
    public static void main(String[] args) {

        Set<DatabaseConnection> databaseConnections = new HashSet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            executorService.submit(() -> databaseConnections.add(DatabaseConnection.getInstance()));
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Size is: " + databaseConnections.size() + " Time it took (in ms): " + (endTime - startTime));

        executorService.shutdown();

    }
}
