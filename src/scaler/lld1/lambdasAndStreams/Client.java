package scaler.lld1.lambdasAndStreams;

import scaler.lld1.interfaces.A;

public class Client {
    public static void main(String[] args) {

        // Anonymous classes - we can create a class without specifying a name

//        HelloWorldPrinter helloWorldPrinter =  new HelloWorldPrinter();


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World: " + Thread.currentThread().getName());
//            }
//        };
//
//
        Runnable runnable1  = () -> System.out.println("Hello World: " + Thread.currentThread().getName());
//
//        Thread thread = new Thread(runnable1);
//        thread.start();

//
//        new Thread(() -> System.out.println("Hello World: " + Thread.currentThread().getName())).start();
//
//        // Lambdas -> Anonymous implementation/function


//        Lambdas will only work for interfaces which has only one abstract method.
//        SAM interfaces -> Single abstract method
//        FunctionalInterfaces



//MathOperation  mathOperation = () -> System.out.println("Hello");



//
//        MathOperation mathOperation = new Adder();
//        int operate = mathOperation.operate(2, 4);
//        System.out.println(operate);
//
//        MathOperation mathOperation1 = new Subtractor();
//        int operate1 = mathOperation1.operate(2, 4);
//        System.out.println(operate1);


        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mult = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if (b == 0) {
                return 0;
            }
            return a / b;
        };


        System.out.println(add.operate(2, 8));
        System.out.println(sub.operate(2, 8));
        System.out.println(mult.operate(2, 8));
        System.out.println(division.operate(2, 8));

    }
}
