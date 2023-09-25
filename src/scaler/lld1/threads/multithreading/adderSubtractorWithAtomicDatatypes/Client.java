package scaler.lld1.threads.multithreading.adderSubtractorWithAtomicDatatypes;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println("Value of counter is - " + counter.getValue());

    }
}
