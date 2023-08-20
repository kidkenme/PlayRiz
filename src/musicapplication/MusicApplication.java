
package musicapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class MusicApplication {

    
    public static void main(String[] args) {
      try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "root123");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("Select * from login;");
    while(rs.next())
    {
        String username=rs.getString("username");
        System.out.println(" username :"+username);
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 

    }
    
}
