import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Databaseconnect {
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/bankmanagement";
    private String username = "root";
    private String password = "Adityasac$029";

    public Databaseconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }

    public void insertData(String fono, String name, String fatherName, String dob, String email, String gender, String maritalStatus, String address, String city, String state, String pincode) {
        String query = "INSERT INTO  user_info (fono, name, father_name, dob, email, gender, marital_status, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, fono);
            pstmt.setString(2, name);
            pstmt.setString(3, fatherName);
            pstmt.setString(4, dob);
            pstmt.setString(5, email);
            pstmt.setString(6, gender);
            pstmt.setString(7, maritalStatus);
            pstmt.setString(8, address);
            pstmt.setString(9, city);
            pstmt.setString(10, state);
            pstmt.setString(11, pincode);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            conn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}