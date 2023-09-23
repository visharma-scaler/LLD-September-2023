package scaler.lld1.threads.multithreading.adderSubtractor;

public class Adder implements Runnable{

    private Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            counter.increment(i);
        }
    }
}
