import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Databaseconnect {
    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/bankmanagement";
    private final String username = "root";
    private final String password = "Adityasac$029";

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

    public void insertData(String fono, String name, String fatherName, String dob, String email, String gender, 
                           String maritalStatus, String address, String city, String state, String pincode) {
        String query = "INSERT INTO user_info (fono, name, father_name, dob, email, gender, marital_status, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

    public void insertData2(String fono, String religion, String category, String education, String occupation,
                            String qualification, String panNumber, String income, String adharNumber, 
                            String seniorCitizen, String existingAccount) {
        String query = "INSERT INTO Signup2 (form_number, religion, category, education, occupation, qualification, pan_number, income, adhar_number, senior_citizen, existing_account) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, fono);
            pstmt.setString(2, religion);
            pstmt.setString(3, category);
            pstmt.setString(4, education);
            pstmt.setString(5, occupation);
            pstmt.setString(6, qualification);
            pstmt.setString(7, panNumber);
            pstmt.setString(8, income);
            pstmt.setString(9, adharNumber);
            pstmt.setString(10, seniorCitizen);
            pstmt.setString(11, existingAccount);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully into Signup2");
        } catch (SQLException e) {
            System.out.println("Error inserting data into Signup2: " + e.getMessage());
        }
    }
    public void insertData3(String fono, String atype, String cardno, String pin, String facility) {
        String query = "INSERT INTO  account_details (fono, atype, cardno, pin, facility) VALUES (?,?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, fono);
            pstmt.setString(2, atype);
            pstmt.setString(3, cardno);
            pstmt.setString(4, pin);
            pstmt.setString(5, facility);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully into signup3");
        } catch (SQLException e) {
            System.out.println("Error inserting data into signup3: " + e.getMessage());
        }
    }
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
