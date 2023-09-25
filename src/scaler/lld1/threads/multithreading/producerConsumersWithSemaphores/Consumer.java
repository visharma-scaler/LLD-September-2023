package scaler.lld1.threads.multithreading.producerConsumersWithSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private String name;
    private Queue<Shirt> store;

    private int sizeOfQueue;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Shirt> store, String name, int sizeOfQueue, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.sizeOfQueue = sizeOfQueue;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Consumer " + name + " is removing item " + store.size());
            store.remove();

            producerSemaphore.release();
        }
    }
}
