/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.ContactUsDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class ContactUsAuthentification {
    public boolean isContact(ContactUsDTO cu){
        
        String name = cu.getName();
        String email = cu.getEmail();
        String contact = cu.getMobile();
        String message = cu.getMessage();
        
        
     try{
    Statement st =null;
    ResultSet rs=null;
             st=DBConnector.getStatement();
            String  query="insert into contactus values('"+name+"','"+email+"','"+contact+"','"+message+"')";
            st.executeUpdate(query);
return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        if(name!=null && email!=null && !name.trim().equals("") && message!=null && contact!=null )
   
        {
            return true;
        }
        
        return false;
    }
    
    
}
