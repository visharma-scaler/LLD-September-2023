package scaler.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class Client2 {


    private static List<Animal> copyAnimals(List<? extends Animal> animals) {
        List<Animal> copyList = new ArrayList<>();
        for (Animal animal: animals) {
            copyList.add(animal);
        }
        return copyList;
    }

    public static void main(String[] args) {
        Animal animal = new Dog("Dog1");

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

//        List<Animal> animalCopy = dogs;

        dogs.add(new Dog("Dog 2"));
        dogs.add(new Dog("Dog 3"));
        dogs.add(new Dog("Dog 4"));


        List<Animal> copyAnimals = copyAnimals(dogs);

        System.out.println(copyAnimals);


    }
}
