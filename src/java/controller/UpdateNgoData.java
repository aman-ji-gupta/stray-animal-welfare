/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UpdateNgoDataDTO;
import java.io.IOException;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UpdateNgoAuthentification;

/**
 *
 * @author Lenovo
 */
public class UpdateNgoData extends HttpServlet {
 public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
        response.sendRedirect("AddNewStudent.jsp");
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
   String pin_code = request.getParameter("pincode");
   String name = request.getParameter("name");
   String contact = request.getParameter("contact");
   String address = request.getParameter("address");
   String description = request.getParameter("description");
   
   
   //now creating AddNewStudentDTO object and setting the values in it
        UpdateNgoDataDTO ngo = new UpdateNgoDataDTO();
 ngo.setPin_code(pin_code);
 ngo.setName(name);
 ngo.setContact(contact);
 ngo.setAddress(address);
 ngo.setDescription(description);
 
//now creating authentication class object
        UpdateNgoAuthentification  ns = new UpdateNgoAuthentification();
 
 boolean add =ns.isAddNewNGO(ngo);
 
 if(add){
     response.sendRedirect("admin.html");
 }else{
     response.sendRedirect("UpdateNGO.jsp");
 }

    }}