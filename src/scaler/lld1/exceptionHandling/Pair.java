package scaler.lld1.exceptionHandling;

public class Pair<FIRST, SECOND> {
    private FIRST first;
    private SECOND second;

    public Pair(FIRST first, SECOND second) {

        if (first == null || second == null) {
            throw new NullValuesException();
        }

        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
