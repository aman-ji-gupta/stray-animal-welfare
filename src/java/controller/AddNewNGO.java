/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.AddNewNGODTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddNewNGOAuthentication;

/**
 *
 * @author Lenovo
 */
public class AddNewNGO extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("AddNewNGO.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String pincode = request.getParameter("pincode");
   String name = request.getParameter("name");
  
   String contact = request.getParameter("contact");

   String description = request.getParameter("description");
   String address = request.getParameter("address");
 
   
   
        AddNewNGODTO student = new AddNewNGODTO();
 student.setPincode(pincode);
 student.setName(name);
 
 student.setContact(contact);

 student.setDiscription(description);


 student.setAddress(address);

 
        AddNewNGOAuthentication fa = new AddNewNGOAuthentication();
 boolean add = fa.isAddNewNGO(student);
 
 if(add){
     response.sendRedirect("admin.html");
 }else{
     response.sendRedirect("AddNewNGO.jsp");
 }
    }
    }

    

