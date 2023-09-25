package scaler.lld1.threads.multithreading.adderSubtractorWithAtomicDatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value = new AtomicInteger(0);

    public int getValue() {
        return this.value.get();
    }

    public void increment(int offset) {
        this.value.addAndGet(offset);
    }

    public void decrement(int offset) {
        this.value.addAndGet(-1 * offset);
    }
}
