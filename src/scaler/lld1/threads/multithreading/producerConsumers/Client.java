package scaler.lld1.threads.multithreading.producerConsumers;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>();
        int sizeOfQueue = 6;

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Producer(store, "p1", sizeOfQueue));
        executorService.submit(new Producer(store, "p2", sizeOfQueue));
        executorService.submit(new Producer(store, "p3", sizeOfQueue));


        executorService.submit(new Consumer(store, "c1", sizeOfQueue));
        executorService.submit(new Consumer(store, "c2", sizeOfQueue));
        executorService.submit(new Consumer(store, "c3", sizeOfQueue));
        executorService.submit(new Consumer(store, "c4", sizeOfQueue));
        executorService.submit(new Consumer(store, "c5", sizeOfQueue));
    }
}
