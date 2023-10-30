package scaler.lld2.observer;

public class ReturnData {
    private String status;

    public ReturnData(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnData{" +
                "status='" + status + '\'' +
                '}';
    }
}
