/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ContactUsDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContactUsAuthentification;

/**
 *
 * @author Lenovo
 */
public class ContactUs extends HttpServlet {

   
public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
    response.sendRedirect("index.jsp");
}

public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String contact = request.getParameter("contact");
    String message = request.getParameter("message");
    
    ContactUsDTO cu = new ContactUsDTO();
    cu.setName(name);
    cu.setEmail(email);
    cu.setMobile(contact);
    cu.setMessage(message);
    
    
    ContactUsAuthentification ca=new ContactUsAuthentification();
     boolean cau = ca.isContact(cu);
    
    if(cau){
        response.sendRedirect("index.jsp");
    }else{
         response.sendRedirect("newjsp.jsp");
    }
    
    
    
    
}



}
