package scaler.lld1.exceptionHandling;

public class PairVariant {
    String left;
    String right;

    PairVariant(Object left, Object right) {

        if(left == null || right == null) {
            throw new RuntimeException("Null values are not allowed!");
        }

        this.left = (String) left;
        this.right = (String) right;
    }

    @Override
    public String toString() {
        return "PairVariant{" +
                "left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}
