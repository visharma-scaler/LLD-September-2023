package scaler.lld1.exceptionHandling;

public class NullValuesException extends RuntimeException {

    public NullValuesException() {
        super("Null values are not allowed!");
    }

    public NullValuesException(String message) {
        super(message);
    }

}
