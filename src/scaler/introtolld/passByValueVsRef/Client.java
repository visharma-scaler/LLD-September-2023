package scaler.introtolld.passByValueVsRef;

public class Client {

    private static void doSomething(Student student) {
//        student = new Student("Sravya");
        student.name = "Sravya";
    }

    public static void main(String[] args) {
        Student student = new Student("Akhil");

        doSomething(student);

        System.out.println("DEBUG");

    }
}
