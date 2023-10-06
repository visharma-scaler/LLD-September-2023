package scaler.lld1.exceptionHandling;

public class Client4 {

    public static void main(String[] args) {

            doSomething(10);
    }


    @SneakyThrows
    private static void doSomething(int a) throws Exception {
        if (a == 10) {
            throw new Exception("Number should not be 10");
        }

        System.out.println("Printing number - " + a);

    }
}
