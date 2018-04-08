package connections;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
    private Connection connection = null;
    private static ConnectionDao connectionDao;

    private ConnectionDao()throws SQLException, ClassNotFoundException{
        this.createConection();
    }

    public static ConnectionDao getInstance() throws SQLException, ClassNotFoundException {
        if (connectionDao == null) {
            connectionDao = new ConnectionDao();
        }
        return connectionDao;
    }

    private void createConection() throws SQLException, ClassNotFoundException {
        String urlDatabase = "jdbc:postgresql://localhost:5432/Abarrotes";
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(urlDatabase, "postgres", "JuanaAbarrotes");
    }

    public Connection getConnection() {
        return connection;
    }

}
