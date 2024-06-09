
package user;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Naveen viduranga
 */
public class usercontroller {

    
    public static void adddata(String id,String name,String gender,String phone, String address, String username,String password){
        
        if(id.equals("") || password.equals("")|| name.equals("") || gender.equals("")|| address.equals("") || username.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty");
            
        }
        else{
            try{
                Integer.parseInt(id);
                Integer.parseInt(phone);
                
                String[] data = {id,name,gender,phone,address,username,password};
                DBControll.setdata(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id or phone number is not an integer");
            }

        }
    }
    
    public static void adddataStudent(String id,String name,String gender,String phone, String address, String username,String password){
        
        if(id.equals("") || password.equals("")|| name.equals("") || gender.equals("")|| address.equals("") || username.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty");
            
        }
        else{
            try{
                Integer.parseInt(id);
                Integer.parseInt(phone);
                
                String[] data = {id,name,gender,phone,address,username,password};
                DBControll.setdataStudent(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id or phone number is not an integer");
            }

        }
    }
    
    
    public static void updatedata(String id,String name,String gender,String phone, String address, String username,String password){
        
        if(id.equals("") || password.equals("")|| name.equals("") || gender.equals("")|| address.equals("") || username.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty");
            
        }
        else{
            try{
                Integer.parseInt(id);
                Integer.parseInt(phone);
                
                String[] data = {id,name,gender,phone,address,username,password};
                DBControll.updateuser(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id or phone number is not an integer");
            }

        }
    }

        public static void updatedataStudent(String id,String name,String gender,String phone, String address, String username,String password){
        
        if(id.equals("") || password.equals("")|| name.equals("") || gender.equals("")|| address.equals("") || username.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty");
            
        }
        else{
            try{
                Integer.parseInt(id);
                Integer.parseInt(phone);
                
                String[] data = {id,name,gender,phone,address,username,password};
                DBControll.updateuserStudent(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id or phone number is not an integer");
            }

        }
    }
    
    
    
    public static void deletedata(String username){
        DBControll.deleteuser(username);
    }
    
    public static void deletedataStudent(String username){
        DBControll.deleteuserStudent(username);
    }
    
    public static void changepassword(String id, String newpassword, String oldpassword){
        if(DBControll.getpassword(id).equals(oldpassword) == true){
            DBControll.setpassword(id, newpassword);
        }else{
             
        }
    }
    
    public static void addEvent(String id,String date,String description){
               if(id.equals("") || date.equals("")|| description.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty"); 
        }
        else{
            try{
                Integer.parseInt(id);
                
                
                String[] data = {id,date,description};
                DBControll.setEvent(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id is not an integer");
            }

        }

    }
    
    public static void updateEvent(String id,String date,String description){
               if(id.equals("") || date.equals("")|| description.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty"); 
        }
        else{
            try{
                Integer.parseInt(id);
                
                
                String[] data = {id,date,description};
                DBControll.updateEvent(data);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id is not an integer");
            }

        }

    }
    
        public static void deleteEvent(String reason){
        DBControll.deleteEvent(reason);
    }
        
        public static void deleteleaves(String id){
        DBControll.deleteleave(id);
    }
    
    public static void addleaves(String id,String date,String reason){
        
        if(id.equals("") || date.equals("")|| reason.equals("")){

            JOptionPane.showMessageDialog(null,"Some fields are Empty");
            
        }
        else{
            try{
                Integer.parseInt(id);
                
                String[] data = {id,date,reason};
                DBControll.setleaves(data);
                JOptionPane.showMessageDialog(null,"Leave Added");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Id or phone number is not an integer");
            }

        }
    }  
    
}
