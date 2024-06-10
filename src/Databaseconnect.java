import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane; // Import JOptionPane

public class Databaseconnect {
    // Modify actionPerformed method to accept a reference to the component
    public void actionPerformed(Signup parentComponen ) { // Accept a reference to the component
        // Inside the actionPerformed methodomponeS

        // Establishing connection parameters
        String url = "jdbc:mysql://localhost:3306/bankmanagement"; // Update with your MySQL database URL
        String username = "root"; // Update with your MySQL username
        String password = "Adityasac$029"; // Update with your MySQL password

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            conn = DriverManager.getConnection(url, username, password);

            // Prepare SQL statement
            String sql = "INSERT INTO user_info (application_number, name, father_name, dob, email, gender, marital_status, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);

            // Execute the SQL statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("User information inserted successfully.");
            }

          
            // Close the resources
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
          }
        } catch (SQLException ex) {
            ex.printStackTrace();
    }
}
