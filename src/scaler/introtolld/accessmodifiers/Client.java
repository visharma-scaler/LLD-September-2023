package scaler.introtolld.accessmodifiers;

public class Client {

    public void doSomething() {
        Student student = new Student();
        student.psp = 10.01;
//        student.name = "Sharma"; ERROR: name is private
        student.batchId = 2;
        student.universityName = "world";
    }
}
