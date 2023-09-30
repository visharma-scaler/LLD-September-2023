package scaler.lld1.generics;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Good Morning from Dog!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
