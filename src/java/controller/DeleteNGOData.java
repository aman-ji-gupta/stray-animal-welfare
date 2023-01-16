/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.DeleteNGODataDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DeleteNGOAuthentication;

/**
 *
 * @author Lenovo
 */
public class DeleteNGOData extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   HttpSession session = request.getSession();
  // String faculty_id = request.getParameter("faculty_id");
 String contact =(String)session.getAttribute("contact");
   
   //now creating AddNewStudentDTO object and setting the values in it
        DeleteNGODataDTO student = new DeleteNGODataDTO();
 student.setContact(contact);

//now creating authentication class object
        DeleteNGOAuthentication  ds = new DeleteNGOAuthentication();
 
 boolean delete =ds.isDeleteNGO(student);
 
 if(delete){
     response.sendRedirect("admin.html");
 }else{
     response.sendRedirect("DeleteNGO.jsp");
 }

    }
    
    
    
 

    
}
