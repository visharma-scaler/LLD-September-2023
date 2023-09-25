package scaler.lld1.threads.multithreading.producerConsumersWithSemaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>();
        int sizeOfQueue = 6;

        Semaphore producerSemaphore = new Semaphore(sizeOfQueue);
        Semaphore consuemrSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Producer(store, "p1", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Producer(store, "p2", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Producer(store, "p3", sizeOfQueue, producerSemaphore, consuemrSemaphore));


        executorService.submit(new Consumer(store, "c1", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Consumer(store, "c2", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Consumer(store, "c3", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Consumer(store, "c4", sizeOfQueue, producerSemaphore, consuemrSemaphore));
        executorService.submit(new Consumer(store, "c5", sizeOfQueue, producerSemaphore, consuemrSemaphore));
    }
}
