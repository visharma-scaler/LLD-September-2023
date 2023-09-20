package scaler.lld1.threads.multithreading.numberPrinter;

public class NumberPrinter implements Runnable {

    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing number: " + numberToPrint + " from thread - " + Thread.currentThread().getName());
    }
}
