package scaler.lld1.exceptionHandling;

import java.awt.geom.IllegalPathStateException;

public class Client2 {
    public static void main(String[] args) {
//        PairVariant pairVariant = new PairVariant("a", "b");
//        System.out.println(pairVariant);


//        PairVariant pairVariant1 = new PairVariant("a", null);
//        System.out.println(pairVariant1);


//        try {
//
//            PairVariant pairVariant2 = new PairVariant(1, "b");
//            System.out.println(pairVariant2);
//        } catch (NullValuesException e) {
//            System.out.println(e.getMessage());
//        } catch (ClassCastException e) {
//            System.out.println("Invalid data provided");
//        }


        try {
            PairVariant pairVariant = new PairVariant(1, 2);
            System.out.println(pairVariant);
        } catch (Exception e) {
            System.out.println("Caught Exception");
            throw new IllegalPathStateException();
        }

        System.out.println("Proceeding normally");
    }
}
