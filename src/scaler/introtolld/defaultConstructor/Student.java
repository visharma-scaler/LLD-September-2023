package scaler.introtolld.defaultConstructor;

public class Student {
    String name;
    int age = 21;

    double psp;
    String universityName;


    private Student(String studentName, String studentUniversityName) {
        name = studentName;
        universityName = studentUniversityName;
    }


}
