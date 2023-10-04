package scaler.lld1.lambdasAndStreams;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Client2 {
    public static void main(String[] args) {

//        System.out.println(calculate(8, 10, add()));
//        System.out.println(calculate(8, 10, (a, b) -> a - b));
//        System.out.println(calculate(8, 10, (a, b) -> a * b));
//        System.out.println(calculate(8, 10, (a, b) -> a / b));

        Client2 client2 = new Client2();

        System.out.println(calculate(8, 10, client2::addOperation));
        System.out.println(calculate(8, 10, Operations::subtract));
        System.out.println(calculate(8, 10, Operations::multiply));
        System.out.println(calculate(8, 10, Operations::divide));




    }

    public static int calculate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    private static MathOperation add() {
        return (a, b) -> a + b;
    }


    private int addOperation(int a, int b) {
        return a + b;
    }


}
