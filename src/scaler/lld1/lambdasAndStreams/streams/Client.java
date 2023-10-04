package scaler.lld1.lambdasAndStreams.streams;

import scaler.lld1.comparisions.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

//        10B;
//
//        List<Product> productList;
//        for (Product p : productList) {
//            // do something
//        }


//        List<Integer> integers = List.of(1, 3, 32, 23, 34232, 123);
////        for (Integer integer: integers) {
////            System.out.println(integer);
////        }
//
//
//        integers.stream()
//                .forEach(System.out::println);

        question8();

    }


    // Terminal Operation - collect, forEach, reduce
    // Intermediary Operation - filter, map

    private static void question1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .map(Client::squareIt)
                .forEach(System.out::println);

    }

    private static void question2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(Client::isEven)
                .forEach(System.out::println);
    }

    private static void question3() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(Client::isEven)
                .toList();

        System.out.println(evenNumbers);
    }

    private static void question8() {

//        ((((1 + 2) + 3) + 4) + 5)

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .reduce(0, (accumulator, currentElement) -> accumulator + currentElement);

        System.out.println(sum);
    }

    private static boolean isEven(int a) {
        return a % 2 == 0;
    }

    private static int squareIt(int a) {
        return a * a;
    }
}
