/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.DeleteNGODTO;
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
public class DeleteNGO extends HttpServlet {

   public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
       response.sendRedirect("DeleteFaculty.jsp");
   }
   
   public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
    
    String contact = request.getParameter("contact");
       DeleteNGODTO faculty = new DeleteNGODTO();
    faculty.setContact(contact);
    
    
    
       HttpSession session = request.getSession();
    session.setAttribute("contact", contact);
    
    
    response.sendRedirect("DeleteNGO.jsp");
}

}
