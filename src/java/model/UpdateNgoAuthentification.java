/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;

import dto.UpdateNgoDataDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class UpdateNgoAuthentification {
     public boolean isAddNewNGO(UpdateNgoDataDTO ngo ){
        

   String pin_code = ngo.getPin_code();
   String name = ngo.getName();
 
   String description = ngo.getDescription();
   String contact = ngo.getContact();
   String address = ngo.getAddress();
  
   
        try {
            
        
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "update ngo set pin_code='"+pin_code+"',ngo_name='"+name+"',description='"+description+"',contact='"+contact+"',address='"+address+"' where contact='"+contact+"' ";
        st.executeUpdate(query);
        return true;
        }
        catch (SQLException e) {
                System.out.println(e);
        }
        return false;
    }
}
