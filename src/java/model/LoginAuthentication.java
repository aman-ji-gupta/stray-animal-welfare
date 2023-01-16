/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dto.LoginDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class LoginAuthentication {
    
    public boolean islogin(LoginDTO ldto1){
       
        String email = ldto1.getEmail();
        String password = ldto1.getPassword();
        String tablepassword="";
    try{
    
      Statement st = null;
       ResultSet rs= null;
      
            
            st=db.DBConnector.getStatement();
            
            String query = "select password from login where email='"+email+"'";
    
            rs=st.executeQuery(query);
            
            if(rs.next()){
                tablepassword = rs.getString(1);
            }else{
                return false;
            }
    
}catch(SQLException e){
            System.out.println(e);
}
          if(email!=null && password!=null && !email.trim().equals("") && password.equals(tablepassword)){
    return true;
    }
        return false;
    }
    
    
}
