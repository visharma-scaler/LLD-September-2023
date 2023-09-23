package scaler.lld1.threads.multithreading.adderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Counter counter;
    private Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }


    @Override
    public void run() {
        for(int i = 1; i <= 50; i++) {
            lock.lock();
            lock.lock();
            counter.increment(i);
            System.out.println("Adding value - " + i);
            lock.unlock();
            lock.unlock();
        }
    }
}
