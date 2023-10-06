package scaler.lld1.exceptionHandling;

public class Client3 {
    public static void main(String[] args) {
        int result = divide(10, 0);
    }

    @Deprecated
    private static int divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
            return result;
        } catch (Exception e) {
            System.exit(123);
//            throw new RuntimeException();
//            System.out.println("Exception caught");
            return 0;
        } finally {
            System.out.println("Good Bye");
        }
    }
}
