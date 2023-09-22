package scaler.lld1.threads.multithreading.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {

        List<Integer> arrayToSort = List.of(8, 6, 0, 1, 4, 9, 7, 3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arrayToSort, executorService);
        Future<List<Integer>> listFuture = executorService.submit(mergeSorter);

        List<Integer> sortedArray = listFuture.get();

        System.out.println("Sorted Array is: " + sortedArray);

        executorService.shutdown();
    }
}
