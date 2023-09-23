package scaler.lld1.threads.multithreading.adderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    private Counter counter;
    private Lock lock;

    public Subtractor(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 50; i++) {
            lock.lock();
            counter.decrement(i);
            System.out.println("Subtracting value - " + i);
            lock.unlock();
        }
    }
}
