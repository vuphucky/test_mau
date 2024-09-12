package db_conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDB {
    private String jdbcURL = "jdbc:mysql://localhost:3306/product_test";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";

    public Connection connectDB() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
