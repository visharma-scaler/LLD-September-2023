package scaler.lld1.threads.multithreading.adderSubtractorWithAtomicDatatypes;

public class Subtractor implements Runnable {

    private Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            counter.decrement(i);
        }
    }
}
