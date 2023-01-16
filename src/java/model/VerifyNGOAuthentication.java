/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;

import dto.VerifyNGODTO;
import dto.VerifyNGODataDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class VerifyNGOAuthentication {
     public boolean isVerifyNGO(VerifyNGODataDTO student ){
        


  String contact = student.getContact();
    
 
        try {
            
        
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "update ngo set verified='yes' where contact='"+contact+"' ";
            System.out.println(query);
            
        st.executeUpdate(query);
        return true;
        }
        catch (SQLException e) {
                System.out.println(e);
        }
        return false;
    }
    
    
    
}
