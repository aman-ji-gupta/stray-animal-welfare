/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.AddNewNGODTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class AddNewNGOAuthentication {
    
    public boolean isAddNewNGO(AddNewNGODTO student){
    
    String pincode = student.getPincode();
   String name = student.getName();
 
   String contact = student.getContact();
  
   String description = student.getDiscription();

   String address = student.getAddress();

   
   
    try {
            
        
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "insert into ngo values('"+pincode+"','"+name+"','"+description+"','"+contact+"','"+address+"')";
        st.executeUpdate(query);
        return true;
        }
        catch (SQLException e) {
                System.out.println(e);
        }
        return false;
    }
    
    
}
