/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dto.UpdateNgoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class UpdateNgoDAO {
  
    public UpdateNgoDTO getNgoData(String contact){
         UpdateNgoDTO ngo = new UpdateNgoDTO();
        
        try{
            Statement st = db.DBConnector.getStatement();
            String query = "select * from ngo where contact='"+contact+"'";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
 ngo.setPin_code(rs.getString(1));
 ngo.setName(rs.getString(2));

 ngo.setDescription(rs.getString(3));
 
 ngo.setContact(rs.getString(4));
 ngo.setAddress(rs.getString(5));

            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return ngo;
        
    }
    
}
