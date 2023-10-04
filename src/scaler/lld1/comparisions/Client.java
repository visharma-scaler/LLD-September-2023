package scaler.lld1.comparisions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Vishal", 70));
        students.add(new Student(30, "Krishna", 90));
        students.add(new Student(27, "Samir", 100));


        System.out.println("Before: " + students);

        Collections.sort(students);

        System.out.println("After:" + students);
        System.out.println();

        Collections.sort(students, new PspComparator());

        System.out.println("After Comparator:" + students);
        System.out.println();

        Collections.sort(students, (a, b) -> a.name.compareTo(b.name));

        System.out.println("After name Comparator:" + students);


    }
}
