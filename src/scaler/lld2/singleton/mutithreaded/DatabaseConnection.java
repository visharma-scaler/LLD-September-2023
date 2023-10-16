package scaler.lld2.singleton.mutithreaded;

public class DatabaseConnection {

    private static DatabaseConnection instance = new DatabaseConnection();

    private String url;
    private String username;
    private String password;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        return instance;
    }
}
