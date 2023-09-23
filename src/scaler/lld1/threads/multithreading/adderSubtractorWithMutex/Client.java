package scaler.lld1.threads.multithreading.adderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(counter, lock);
        Subtractor subtractor = new Subtractor(counter, lock);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Value of counter is - " + counter.getValue());

    }
}
