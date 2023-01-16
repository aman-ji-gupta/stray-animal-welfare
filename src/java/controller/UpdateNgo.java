/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dto.UpdateNgoDTO;
import java.io.IOException;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class UpdateNgo extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    response.sendRedirect("updateNgo.jsp");
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String contact = request.getParameter("contact");
        UpdateNgoDTO  ngo = new UpdateNgoDTO();
        ngo.setContact(contact);
        
       HttpSession session = request.getSession();
       session.setAttribute("contact", contact);
    response.sendRedirect("updateNgo.jsp");
    }
    
    
    

}