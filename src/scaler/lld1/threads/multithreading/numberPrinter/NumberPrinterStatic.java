package scaler.lld1.threads.multithreading.numberPrinter;

public class NumberPrinterStatic implements Runnable {

    private static int numberToPrint = 0;

    @Override
    public void run() {
        System.out.println("Printing number: " + numberToPrint + " from thread - " + Thread.currentThread().getName());
        numberToPrint += 1;
    }
}
