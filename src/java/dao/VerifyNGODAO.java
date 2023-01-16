/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.DeleteNGODTO;
import dto.VerifyNGODTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class VerifyNGODAO {
     public VerifyNGODTO getNGOData(){
          VerifyNGODTO ngo = new VerifyNGODTO();
        
        try {

            Statement st = DBConnector.getStatement();
            String query = "select * from ngo where verified='No' ";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
              ngo.setPincode(rs.getString(1));
              ngo.setName(rs.getString(2));
              ngo.setDiscription(rs.getString(3));
              ngo.setContact(rs.getString(4));
              ngo.setAddress(rs.getString(5));
              
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ngo;
    }
}
