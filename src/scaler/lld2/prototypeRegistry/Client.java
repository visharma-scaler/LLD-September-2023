package scaler.lld2.prototypeRegistry;

public class Client {

    private static final StudentRegistry studentRegistry = new StudentRegistry();

    private static void fillRegistry() {
        Student student = new Student();
        student.setName("Student 1");
        student.setAge(28);
        student.setPsp(82.0);
        student.setBatchName("June 2023");
        student.setAvgPspOfBatch(80.23);


        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIq(100);
        intelligentStudent.setName("IS 1");
        intelligentStudent.setAge(30);
        intelligentStudent.setPsp(100.0);
        intelligentStudent.setBatchName("July 2023");
        intelligentStudent.setAvgPspOfBatch(99.0);

        studentRegistry.setPrototype("June 2023", student);
        studentRegistry.setPrototype("July 2023", intelligentStudent);
    }



    public static void main(String[] args) {

        fillRegistry();


        Student mariya = studentRegistry.getPrototype("June 2023").copy();
        mariya.setName("Mariya");
        mariya.setAge(25);
        mariya.setPsp(80.0);


        Student akhil = studentRegistry.getPrototype("June 2023").copy();
        akhil.setName("Akhil");
        akhil.setAge(24);
        akhil.setPsp(90.0);


        Student intelligentAkhil = studentRegistry.getPrototype("July 2023").copy();
        intelligentAkhil.setName("Intelligent Akhil");
        intelligentAkhil.setAge(30);
        intelligentAkhil.setPsp(99.0);

        System.out.println("DEBUG");
    }
}
