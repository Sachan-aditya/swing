import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnect {
    public Databaseconnect(){
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://bankmanagement","root","Adityasac$029");
        Statement stmt = con.createStatement();

      }
      catch(Exception e)
      {
        System.out.println(e);
      }

    }
}
