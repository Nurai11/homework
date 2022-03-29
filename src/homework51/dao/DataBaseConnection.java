package homework51.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "56160211";

    public static Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return connection;
    }
}
