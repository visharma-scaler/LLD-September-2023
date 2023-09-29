package scaler.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        Pair pair = new Pair();
//
//        pair.hashCode();
//        pair.notify();
//
//        Object a = new Object();


        Pair<Integer, String> pair = new Pair<>(10, "Vishal");

        pair.getFirst().longValue();

        System.out.println(pair);

        Pair<Double, Double> pair1 = new Pair<>(10.7, 20.7);
        System.out.println(pair1);

        Pair<String, String> pair2 = new Pair<>("Hello", "Vishal");
        String first1 = pair2.getFirst();
        first1.compareTo("");
        System.out.println(pair2);

        Pair<Long, String> pair3 = new Pair<>(10L, "Vishal");
        byte b = pair3.getFirst().byteValue();
        System.out.println(b);
        System.out.println(pair3);

//        Pair<int, int> pair4 = new Pair<int, int>();

//        int, long, double

        List l = new ArrayList(); // java 2

        Client client = new Client();

        Pair pair5 = new Pair("1", "2");
        Object first = pair5.getFirst();
//        first.compareTo();

        Pair<Object, Object> pair4= new Pair<>("1","2");
        String first2 = (String) pair4.getFirst();
        first2.compareTo("Hello");

    }
}
