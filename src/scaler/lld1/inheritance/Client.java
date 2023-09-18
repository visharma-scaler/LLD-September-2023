package scaler.lld1.inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.login();

        instructor.scheduleClass();

        User user = new User();
        user.login();

//        user.scheduleClass();
    }
}
