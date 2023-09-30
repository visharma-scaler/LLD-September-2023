package scaler.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class Client3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Vishal");

        List<Animal> list2 = new ArrayList<>();
        list2.add(new Animal());
        list2.add(new Dog("Dog 1"));
        list2.add(new Animal());

        System.out.println(list.getClass().getName());
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());

        System.out.println(list1.getClass() == list.getClass());
        System.out.println(list2.getClass() == list.getClass());
        System.out.println(list2.getClass() == list1.getClass());



        Animal animal = new Dog("Dog 1");
        animal.greet();

    }
}
