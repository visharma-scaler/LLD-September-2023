package scaler.lld1.passByValueVsRef;

public class Student {
    public String name;
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
