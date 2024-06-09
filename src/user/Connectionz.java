
package user;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connectionz {
    static Connection con;
    
    public static Connection getConnection(){

        try {
            PreparedStatement pst;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectionz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connectionz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
