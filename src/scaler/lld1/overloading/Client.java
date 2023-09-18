package scaler.lld1.overloading;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        a.doSomething("Vishal");

        B b = new B();
        b.doSomething("World");

        A a1 = new B();
        a1.doSomething("Mariya");
    }
}
