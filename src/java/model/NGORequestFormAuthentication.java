/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.NGORequestFormDTO;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class NGORequestFormAuthentication {
    
    public boolean isAddNewNGO(NGORequestFormDTO dto){
          String pincode = dto.getNgopincode();
   String name = dto.getNgoname();
 
   String contact = dto.getNgocontact();
  
   String description = dto.getNgodiscription();

   String address = dto.getNgoaddress();
   
   try{
       
       
        Statement st=null;
        ResultSet rs=null;
        st = DBConnector.getStatement();
        String query = "insert into ngorequesttable values('"+pincode+"','"+name+"','"+description+"','"+contact+"','"+address+"','No')";
        st.executeUpdate(query);
        System.out.println("inserted");
        return true;
       
   }catch(Exception e){
       System.out.println(e);
   }
        
        
                System.out.println("insertion failed");
        return false;
    }
    
    
    
}
