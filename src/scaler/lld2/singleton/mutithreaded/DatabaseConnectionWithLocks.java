package scaler.lld2.singleton.mutithreaded;

public class DatabaseConnectionWithLocks {

    private static DatabaseConnectionWithLocks instance = null;

    private String url;
    private String username;
    private String password;

    private DatabaseConnectionWithLocks() {

    }

    public synchronized static DatabaseConnectionWithLocks getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionWithLocks();
        }
        return instance;
    }
}
