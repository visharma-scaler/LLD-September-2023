package scaler.lld1.threads.multithreading.numberPrinter;

public class Client {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
            NumberPrinterStatic numberPrinter = new NumberPrinterStatic();
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
