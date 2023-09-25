package scaler.lld1.threads.multithreading.producerConsumersWithSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private String name;
    private Queue<Shirt> store;
    private int sizeOfQueue;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Shirt> store, String name, int sizeOfQueue, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
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
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println("Producer " + name + " is adding item " + store.size());
            store.add(new Shirt());

            consumerSemaphore.release();
        }
    }
}
