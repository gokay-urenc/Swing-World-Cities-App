import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private final String USER_NAME = "root";
    private final String PASSWORD = "mysqlroot333";
    private final String DB_URL = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }
    
    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
}