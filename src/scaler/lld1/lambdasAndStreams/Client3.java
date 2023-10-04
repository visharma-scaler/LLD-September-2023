package scaler.lld1.lambdasAndStreams;

public class Client3 {
    public static void main(String[] args) {
        String command = "normal";

        switch (command) {
            case "lower": printLower();
            break;

            case "upper": printUpper();
                break;

            case "normal": printNormal();
                break;
        }

    }


    private static void printLower() {
        String lowerCase = "HeLlo".toLowerCase();
        System.out.println(lowerCase);
    }

    private static void printUpper() {
        String upperCase = "HeLlo".toUpperCase();
        System.out.println(upperCase);
    }

    private static void printNormal() {
        String normal = "HeLlo";
        System.out.println(normal);
    }
}
