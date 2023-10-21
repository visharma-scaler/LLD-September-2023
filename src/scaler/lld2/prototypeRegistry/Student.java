package scaler.lld2.prototypeRegistry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private double avgPspOfBatch;
    private String batchName;

    public Student() {

    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
        this.avgPspOfBatch = student.avgPspOfBatch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }


    public void setAvgPspOfBatch(double avgPspOfBatch) {
        this.avgPspOfBatch = avgPspOfBatch;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
