
package user;

import UI.Teacher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import static user.Connectionz.con;
import UI.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JTable;

public class DBControll {

    private static PreparedStatement pst;
    private static ResultSet rs,rs1;
    private static Object TeacherStudentListTable;
    private static Object jTextField2;
    
    // Function for retrive data from student table

        public static void showContents(JTable tblData){

        try {
            //get database connection
            con = Connectionz.getConnection();
         //   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblData.getModel();
            
            
            int cols=rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
            }
            String uID,name,gender,phone,address,un,pwrd;
         //   String userid,name,email,department,position,password;
            while(rs.next()){
                
                        uID = rs.getString(1);
                        name = rs.getString(2);
                        gender = rs.getString(3);
                        phone = rs.getString(4);
                        address = rs.getString(5);
                        un = rs.getString(6);
                        pwrd = rs.getString(7);
                        String[] row = {uID,name,gender,phone,address,un,pwrd};
                
                model.addRow(row);    
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        }
        
    //show teacher list function
        
    public static void showTeacherContents(JTable tblData){

        try {
            //get database connection
            con = Connectionz.getConnection();
         //   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM teacher";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblData.getModel();
            
            
            int cols=rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
            }
            String uID,name,gender,phone,address,un,pwrd;
         //   String userid,name,email,department,position,password;
            while(rs.next()){
                
                        uID = rs.getString(1);
                        name = rs.getString(2);
                        gender = rs.getString(3);
                        phone = rs.getString(4);
                        address = rs.getString(5);
                        un = rs.getString(6);
                        pwrd = rs.getString(7);
                        String[] row = {uID,name,gender,phone,address,un,pwrd};
                
                model.addRow(row);    
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        }
    
    //update
    
    
    
    
        public static boolean setdata(String[] data){
        
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql1 = "SELECT * FROM teacher WHERE ID ='"+data[0]+"' OR username = '"+data[5]+"' ";
            rs1 = st.executeQuery(sql1); 
            if (rs1.next()) {
              // The query returned 
               JOptionPane.showMessageDialog(null, "ID or username already exist");
            } else {
            
            String sql = "INSERT INTO teacher VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"','"+data[5]+"','"+data[6]+"')";
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Entered Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
        }catch(Exception e){
        }
        
        return successfull;
    }
        
        public static boolean setdataStudent(String[] data){
        
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql2 = "SELECT * FROM student WHERE ID ='"+data[0]+"' OR username = '"+data[5]+"' ";
            rs1 = st.executeQuery(sql2); 
            if (rs1.next()) {
              // The query returned 
               JOptionPane.showMessageDialog(null, "ID or username already exist");
            } else {
            
            String sql = "INSERT INTO student VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"','"+data[5]+"','"+data[6]+"')";
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Entered Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
        }catch(Exception e){
        }
        
        return successfull;
    }
    
    public static boolean updateuser(String[] data){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql2 = "SELECT * FROM teacher WHERE username = '"+data[5]+"' ";
            rs1 = st.executeQuery(sql2); 
            if (rs1.next()) {
              // The query returned 
            
            String sql = "UPDATE teacher SET ID = '"+data[0]+"',Name = '"+data[1]+"',Gender = '"+data[2]+"',Phone = '"+data[3]+"',Address = '"+data[4]+"',password = '"+data[6]+"' WHERE username = '"+data[5]+"'  ";
 
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Updated Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
            else {
            JOptionPane.showMessageDialog(null, "Username Not match");
            }

        }catch(Exception e){
        }
        
        return successfull;
    }
    
       public static boolean updateuserStudent(String[] data){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql2 = "SELECT * FROM student WHERE username = '"+data[5]+"' ";
            rs1 = st.executeQuery(sql2); 
            if (rs1.next()) {
              // The query returned 
            
            String sql = "UPDATE student SET ID = '"+data[0]+"',Name = '"+data[1]+"',Gender = '"+data[2]+"',Phone = '"+data[3]+"',Address = '"+data[4]+"',password = '"+data[6]+"' WHERE username = '"+data[5]+"'  ";
 
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Updated Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
            else {
            JOptionPane.showMessageDialog(null, "Username Not match");
            }

        }catch(Exception e){
        }
        
        return successfull;

    }
    
    
    
    
    public static boolean deleteuser(String username){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM teacher WHERE username='"+username+"'";
            int rs = st.executeUpdate(sql);
        
        if(rs>0){
            successfull = true;
            JOptionPane.showMessageDialog(null,"Data Deleted");
        }else{
            successfull = false;
        }
        st.close();
        con.close();
        }catch(Exception e){ 
        }
        
        return successfull;
    }
    
    public static boolean deleteuserStudent(String username){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM student WHERE username='"+username+"'";
            int rs = st.executeUpdate(sql);
        
        if(rs>0){
            successfull = true;
            JOptionPane.showMessageDialog(null,"Data Deleted");
        }else{
            successfull = false;
        }
        st.close();
        con.close();
        }catch(Exception e){ 
        }
        
        return successfull;
    }
    
        public static String getpassword(String username){
        String password=null;
        try {
            //get database connection
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT password FROM student WHERE username = '"+username+"'";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while(rs.next()){
                password = rs.getString(1);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return password;
    }
    
    
        public static void setpassword(String username, String  pas){
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE student SET password = '"+pas+"' WHERE username = '"+username+"'";
        int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Password Updated Sucessfully ");
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
        
        
    public static String tgetpassword(String username){
        String password=null;
        try {
            //get database connection
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT password FROM teacher WHERE username = '"+username+"'";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while(rs.next()){
                password = rs.getString(1);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return password;
    }
    
    
        public static void tsetpassword(String username, String  pas){
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "UPDATE teacher SET password = '"+pas+"' WHERE username = '"+username+"'";
        int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Password Updated Sucessfully ");
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }    
        
        
        
        
        
        
        
        public static void changepassword(String username, String newpassword, String oldpassword,int t){
        if(t==5){
            if(DBControll.tgetpassword(username).equals(oldpassword) == true){
            DBControll.tsetpassword(username, newpassword);
            }
            else{
                JOptionPane.showMessageDialog(null,"Old password invalid");
            }
        }else if(t==0){
            if(DBControll.getpassword(username).equals(oldpassword) == true){
            DBControll.setpassword(username, newpassword);
            }
            else{
                JOptionPane.showMessageDialog(null,"Old password invalid");
            }
        }
    }
        
        
    public static boolean setEvent(String[] data){
        
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql1 = "SELECT * FROM event WHERE ID ='"+data[0]+"' ";
            rs1 = st.executeQuery(sql1); 
            if (rs1.next()) {
              // The query returned 
               JOptionPane.showMessageDialog(null, "ID already exist");
            } else {
            
            String sql = "INSERT INTO event VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"')";
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Entered Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
        }catch(Exception e){
        }
        
        return successfull;
    }    
    
        public static boolean updateEvent(String[] data){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            String sql2 = "SELECT * FROM event WHERE ID = '"+data[0]+"' ";
            rs1 = st.executeQuery(sql2); 
            if (rs1.next()) {
              // The query returned 
            
            String sql = "UPDATE event SET Date = '"+data[1]+"',Description = '"+data[2]+"' WHERE ID = '"+data[0]+"'  ";
 
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
                JOptionPane.showMessageDialog(null,"Data Updatedd Sucessfully ");
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            }
 
            else {
            JOptionPane.showMessageDialog(null, "ID Not match");
            }

        }catch(Exception e){
        }
        
        return successfull;
    }
        
        public static boolean deleteEvent(String id){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM event WHERE ID='"+id+"'";
            int rs = st.executeUpdate(sql);
        
        if(rs>0){
            successfull = true;
            JOptionPane.showMessageDialog(null,"Data Deleted ");
        }else{
            successfull = false;
        }
        st.close();
        con.close();
        }catch(Exception e){ 
        }
        
        return successfull;
    }
        
        public static boolean deleteleave(String reason){
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            String sql = "DELETE FROM leaves WHERE Reason='"+reason+"'";
            int rs = st.executeUpdate(sql);
        
        if(rs>0){
            successfull = true;
            JOptionPane.showMessageDialog(null,"Data Deleted ");
        }else{
            successfull = false;
        }
        st.close();
        con.close();
        }catch(Exception e){ 
        }
        
        return successfull;
    }
        
        
        public static void showEvents(JTable tblData){

        try {
            //get database connection
            con = Connectionz.getConnection();
         //   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM event";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblData.getModel();
            
            
            int cols=rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
            }
            String eid,edate,edescription;
         //   String userid,name,email,department,position,password;
            while(rs.next()){
                
                        eid = rs.getString(1);
                        edate = rs.getString(2);
                        edescription = rs.getString(3);
                        String[] row = {eid,edate,edescription};
                
                model.addRow(row);    
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }


        public static void showLeaves(JTable tblData){

        try {
            //get database connection
            con = Connectionz.getConnection();
         //   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school information management system","root","1234");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM leaves";
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) tblData.getModel();
            
            
            int cols=rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i=0;i<cols;i++){
                colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
            }
            String id,date,reason;
         //   String userid,name,email,department,position,password;
            while(rs.next()){
                
                        id = rs.getString(1);
                        date = rs.getString(2);
                        reason = rs.getString(3);
                        String[] row = {id,date,reason};
                
                model.addRow(row);    
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBControll.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        }
        

        public static boolean setleaves(String[] data){
        
        boolean successfull = false;
        try{
            con = Connectionz.getConnection();
            Statement st = con.createStatement();
            
            
            String sql = "INSERT INTO leaves VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"')";
            int rs = st.executeUpdate(sql);
        
            if(rs>0){
                successfull = true;
            }else{
                successfull = false;
            }
            st.close();
            con.close();

            
 
        }catch(Exception e){
        }
        
        return successfull;
    }        

}
