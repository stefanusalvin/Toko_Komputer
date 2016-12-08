
package uasjava;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    public static Connection connection;
    
   public connect () {
       try {
           Class.forName ("com.mysql.jdbc.Driver");
           
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko?zeroDateTimeBehavior=convertToNull", "root", "");
           connection.setAutoCommit (true);
       }
       
       catch (ClassNotFoundException ex) {
           System.out.println ("JDBC Driver not found.");
       }
       catch (SQLException ex) {
           System.out.println ("Database connection error.");
       }
   }
    boolean isCon(){
        return(connection!=null);
    } 
}
