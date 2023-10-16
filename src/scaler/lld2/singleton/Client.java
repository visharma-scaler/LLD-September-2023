package scaler.lld2.singleton;

public class Client {
    public static void main(String[] args) {
//        DatabaseConnection databaseConnection1 = new DatabaseConnection();
//        DatabaseConnection databaseConnection2 = new DatabaseConnection();

        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        if (databaseConnection1 == databaseConnection2) {
            System.out.println("Objects are same!");
        } else {
            System.out.println("Objects are different!");
        }

        System.out.println(databaseConnection1  +  "  " + databaseConnection2);

    }
}
