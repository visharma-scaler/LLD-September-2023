package scaler.introtolld.polymorphism;

import java.util.Random;

public class Client {

    public static User getUser() {
        Random random = new Random();
        int value = random.nextInt();

        return value % 2 == 0 ? new Instructor() : new Mentor();
    }

    public static void main(String[] args) {

//        Instructor instructor = new Instructor();
//        instructor.login();
//
//
//        Mentor mentor = new Mentor();
//        mentor.login();

        for (int i = 0; i < 5; i++) {
            ((Instructor) getUser()).scheduleClass();
        }

    }
}
