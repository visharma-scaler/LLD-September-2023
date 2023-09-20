package scaler.lld1.threads.multithreading.numberPrinter.threadpools;


import scaler.lld1.threads.multithreading.numberPrinter.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {

            NumberPrinter numberPrinter = new NumberPrinter(i);
            if (i % 2 == 0) {
                executorService1.submit(numberPrinter);
            } else {
                executorService2.submit(numberPrinter);
            }
        }
    }
}
