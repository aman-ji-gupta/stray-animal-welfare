/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.DisplayNGODTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DisplayNGO extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    response.sendRedirect("index.jsp");
    }

    
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        
    String pincode = reqest.getParameter("pincode");
    
        HttpSession session = reqest.getSession();
         session.setAttribute("pincode", pincode);
         
         DisplayNGODTO ddto = new DisplayNGODTO();
         ddto.setPincode(pincode);
         System.out.println(pincode);
         
         response.sendRedirect("index.jsp#plan");
    }

    
    
   
}
