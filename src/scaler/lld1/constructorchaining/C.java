package scaler.lld1.constructorchaining;

public class C extends B{

    C() {
        System.out.println("I am the constructor of C");
    }

    C(String name) {
        this();
        System.out.println("I am the constructor of C which has name - " + name);
    }
}
