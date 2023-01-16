
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.DeleteNGODataDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class DeleteNGOAuthentication {
      public boolean isDeleteNGO(DeleteNGODataDTO student ){
        


  String contact = student.getContact();
 
        try {
            
        
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "delete from ngo where contact='"+contact+"' ";
        st.executeUpdate(query);
        return true;
        }
        catch (SQLException e) {
                System.out.println(e);
        }
        return false;
    }
}
