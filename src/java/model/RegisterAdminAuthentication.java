/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.RegisterAdminDTO;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class RegisterAdminAuthentication {
    
    public boolean isRegister(RegisterAdminDTO reg){
     
        String username = reg.getUsername();
        String password = reg.getPassword();
        String email = reg.getEmail();
        String contact = reg.getContact();
   
   try{
       
       
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "insert into admin values('"+username+"','"+password+"','"+email+"','"+contact+"')";
        st.executeUpdate(query);
        return true;
       
   }catch(Exception e){
       System.out.println(e);
   }
        
        
        
        return false;
    }
    
}
