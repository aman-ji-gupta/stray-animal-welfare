/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.DeleteNGODTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class DeleteNGODAO {
      public DeleteNGODTO getNGOData(String contact){
          DeleteNGODTO faculty = new DeleteNGODTO();
        
        try {

            Statement st = DBConnector.getStatement();
            String query = "select * from ngo where contact='"+contact+"'";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
              faculty.setPincode(rs.getString(1));
              faculty.setName(rs.getString(2));
              faculty.setDiscription(rs.getString(3));
              faculty.setContact(rs.getString(4));
              faculty.setAddress(rs.getString(5));
              
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return faculty;
    }
}
