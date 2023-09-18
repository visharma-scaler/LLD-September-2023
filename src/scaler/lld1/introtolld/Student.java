package scaler.lld1.introtolld;

public class Student {
    String name;
    String batchName;
    int age;
    double psp;

    public void changeBatch(String newBatch) {
        batchName = newBatch;
    }

    public void giveMockInterviews() {
        System.out.println("Giving Mock Interviews");
    }
}
