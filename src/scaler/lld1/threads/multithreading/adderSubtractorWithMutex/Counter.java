package scaler.lld1.threads.multithreading.adderSubtractorWithMutex;

public class Counter {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    public void increment(int offset) {
        this.value += offset;
    }

    public void decrement(int offset) {
        this.value -= offset;
    }
}
