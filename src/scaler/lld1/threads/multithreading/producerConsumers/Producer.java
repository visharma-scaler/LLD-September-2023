package scaler.lld1.threads.multithreading.producerConsumers;

import java.util.Queue;

public class Producer implements Runnable{

    private String name;
    private Queue<Shirt> store;
    private int sizeOfQueue;

    public Producer(Queue<Shirt> store, String name, int sizeOfQueue) {
        this.store = store;
        this.name = name;
        this.sizeOfQueue = sizeOfQueue;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if (store.size() < sizeOfQueue) {
                    System.out.println("Producer " + name + " is adding item " + store.size());
                    store.add(new Shirt());
                }
            }
        }
    }
}
