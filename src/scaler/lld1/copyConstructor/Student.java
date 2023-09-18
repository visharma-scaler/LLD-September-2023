package scaler.lld1.copyConstructor;

public class Student {
    private String name;
    int batchId;

    protected double psp;
    public String universityName;

    public Student(String name) {
        this.name = name;
    }

    public Student(Student oldStudent) {
        this.name = oldStudent.name;
        this.batchId = oldStudent.batchId;
        this.psp = oldStudent.psp;
        this.universityName = oldStudent.universityName;

    }


}
