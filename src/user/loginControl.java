
package user;

import UI.Supervisor;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static user.Connectionz.con;
import UI.*;

public class loginControl {

    private static PreparedStatement pst;

    private static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Component rootPane;
    private static ResultSet rs;
    
    public static void getloging(String id,String password){
        
        String uID,name,dob,gender,phone,address,un,pwrd;
        Login log1 =new Login();
        
        if(id.equals("") || password.equals("")){
         
            JOptionPane.showMessageDialog(null,"Some fields are Empty\nPlease Enter username and passowrd");
            
        }
        else{
            try{
                con = Connectionz.getConnection();
                
                if("su".equals(id.substring(0, 2))){
                
                    pst = con.prepareStatement("select * from supervisor where username = ? and password= ?");
                    
                    pst.setString(1,id);
                    pst.setString(2, password);
                    rs = pst.executeQuery();
 
                    if(rs.next()){
                    
                    
                        uID = rs.getString("ID");
                        name = rs.getString("Name");
                        gender = rs.getString("Gender");
                        phone = rs.getString("Phone");
                        address = rs.getString("Address");
                        un = rs.getString("username");
                        pwrd = rs.getString("password");
                        
                        Supervisor su1 = new Supervisor(un,uID,name,gender,phone,address,pwrd);;
                        su1.setVisible(true);
                        setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Incorrect User Name or Password");
                            log1.setVisible(true);
                        }
                }
                else if("te".equals(id.substring(0, 2))){
                
                    pst = con.prepareStatement("select * from teacher where username = ? and password= ?");
                    
                    pst.setString(1,id);
                    pst.setString(2, password);
                    rs = pst.executeQuery();

                    if(rs.next()){
                    
                    
                        uID = rs.getString("ID");
                        name = rs.getString("Name");
                        gender = rs.getString("Gender");
                        phone = rs.getString("Phone");
                        address = rs.getString("Address");
                        un = rs.getString("username");
                        pwrd = rs.getString("password");
                        Teacher tea1 = new Teacher(un,uID,name,gender,phone,address,pwrd);
                        tea1.setVisible(true);
                        setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Incorrect User Name or Password");
                            log1.setVisible(true);
                        }
                }
                else if("st".equals(id.substring(0, 2))){
                
                    pst = con.prepareStatement("select * from student where username = ? and password= ?");
                    
                    pst.setString(1,id);
                    pst.setString(2, password);
                    rs = pst.executeQuery();
                
                
                
                    if(rs.next()){
                    
                    
                        uID = rs.getString("ID");
                        name = rs.getString("Name");
                        gender = rs.getString("Gender");
                        phone = rs.getString("Phone");
                        address = rs.getString("Address");
                        un = rs.getString("username");
                        pwrd = rs.getString("password");
                        Student st1 = new Student(un,uID,name,gender,phone,address,pwrd);
                        st1.setVisible(true);
                        setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Incorrect User Name or Password");
                            log1.setVisible(true);
                        }
                }
                else{

                    JOptionPane.showMessageDialog(null,"Incorrect User Name or Password");
                    log1.setVisible(true);
                }
                
               
            }
            catch(Exception ex){
                System.out.println(""+ex);
            }
            
        }

    }
    
}
