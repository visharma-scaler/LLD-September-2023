package scaler.lld1.copyConstructor;

public class Client {
    public static void main(String[] args) {
        Student anand = new Student("anand");
        anand.psp = 80;
        anand.batchId = 2;
        anand.universityName = "Hello";


        Student sindhu = new Student(anand);


        System.out.println("DEBUG");
    }
}
