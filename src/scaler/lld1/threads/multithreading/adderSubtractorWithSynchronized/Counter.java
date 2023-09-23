package scaler.lld1.threads.multithreading.adderSubtractorWithSynchronized;

public class Counter {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    synchronized public void increment(int offset) {
        this.value += offset;
    }

    synchronized public void decrement(int offset) {
        this.value -= offset;
    }
}
