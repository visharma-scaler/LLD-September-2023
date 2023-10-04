package scaler.lld1.lambdasAndStreams;

import java.util.function.Function;

public class Client4 {
    public static void main(String[] args) {
        String command = "upper";

        switch (command) {
            case "lower":
                execute("HelLO", String::toLowerCase);
                break;

            case "upper":
                execute("HelLO", String::toUpperCase);
                break;

            case "normal":
                execute("HelLO", s -> s);
                break;
        }

    }


    private static String execute(String s, Function<String, String> function) {
        String value = function.apply(s);
        System.out.println(value);
        return value;
    }

//
//    private static void printLower() {
//        String lowerCase = "HeLlo".toLowerCase();
//        System.out.println(lowerCase);
//    }
//
//    private static void printUpper() {
//        String upperCase = "HeLlo".toUpperCase();
//        System.out.println(upperCase);
//    }
//
//    private static void printNormal() {
//        String normal = "HeLlo";
//        System.out.println(normal);
//    }
}
