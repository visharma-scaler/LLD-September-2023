package scaler.lld1.inheritance;

public class Instructor extends User {
    String batchName;
    double averageRating;

    void scheduleClass() {
        System.out.println("Instructor is scheduling is the class");
    }
}
