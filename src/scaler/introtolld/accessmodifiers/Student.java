package scaler.introtolld.accessmodifiers;

public class Student {
    private String name;
    int batchId;

    protected double psp;
    public String universityName;


    void doSomething() {
       this.name = "Vishal";
       this.batchId = 123;
       this.psp = 10.0;
       this.universityName = "Hello";
    }
}
