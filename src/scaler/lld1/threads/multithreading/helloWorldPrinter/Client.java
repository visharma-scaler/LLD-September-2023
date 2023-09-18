package scaler.lld1.threads.multithreading.helloWorldPrinter;

public class Client {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {

            //1. Create the Object of the Class which you want to run in threads
            HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

            //2. Pass the object of the task to the Thread class
            Thread thread = new Thread(helloWorldPrinter);

            System.out.println("------------------------------ "  + Thread.currentThread().getName());
            System.out.println("1 " + Thread.currentThread().getName());
            System.out.println("2 " + Thread.currentThread().getName());

            thread.start();

            System.out.println("3 " + Thread.currentThread().getName());
            System.out.println("4 " + Thread.currentThread().getName());
            System.out.println("------------------------------ "  + Thread.currentThread().getName() + "\n");

        }
    }
}
