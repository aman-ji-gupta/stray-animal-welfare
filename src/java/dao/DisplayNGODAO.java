/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.DisplayNGODTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class DisplayNGODAO {

    public DisplayNGODTO getNGOData(String pincode) {
        DisplayNGODTO ddto = new DisplayNGODTO();

        try {

            Statement st = DBConnector.getStatement();
            String query = "select * from ngo where pin_code='" + pincode + "'";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                ddto.setPincode(rs.getString(1));
                ddto.setNgo_name(rs.getString(2));
                ddto.setDiscription(rs.getString(3));
                ddto.setContact(rs.getString(4));
                ddto.setAddress(rs.getString(5));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return ddto;
    }

    public List<DisplayNGODTO> getAllNGOData(String pincode) {

        List<DisplayNGODTO> listOfNGO = new ArrayList<DisplayNGODTO>();
        try 
        {
            Statement st = db.DBConnector.getStatement();
            String query = "select * from ngo where pin_code='"+pincode+"'";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) 
            {
                DisplayNGODTO ddto = new DisplayNGODTO();
                ddto.setPincode(rs.getString(1));
                ddto.setNgo_name(rs.getString(2));
                ddto.setDiscription(rs.getString(3));
                ddto.setContact(rs.getString(4));
                ddto.setAddress(rs.getString(5));
                listOfNGO.add(ddto);
            }

        }catch (SQLException e) {
            System.out.println(e);
        }
        return listOfNGO;
    }
}
