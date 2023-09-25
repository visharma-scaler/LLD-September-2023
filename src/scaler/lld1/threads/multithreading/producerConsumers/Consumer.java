package scaler.lld1.threads.multithreading.producerConsumers;

import java.util.Queue;

public class Consumer implements Runnable {

    private String name;
    private Queue<Shirt> store;

    private int sizeOfQueue;

    public Consumer(Queue<Shirt> store, String name, int sizeOfQueue) {
        this.store = store;
        this.name = name;
        this.sizeOfQueue = sizeOfQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() > 0) {
                    System.out.println("Consumer " + name + " is removing item " + store.size());
                    store.remove();
                }
            }
        }
    }
}
