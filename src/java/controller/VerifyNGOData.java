/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VerifyNGODAO;
import dto.VerifyNGODTO;
import dto.VerifyNGODataDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.VerifyNGOAuthentication;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "VerifyNGOData", urlPatterns = {"/VerifyNGOData"})
public class VerifyNGOData extends HttpServlet {

     protected void doGet(HttpServletRequest request , HttpServletResponse response)  throws ServletException, IOException{
          response.sendRedirect("index.jsp");
    }
    
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
         String contact = request.getParameter("contact");
         System.out.println(contact);
            VerifyNGODataDTO asd = new VerifyNGODataDTO();
            asd.setContact(contact);
           
          VerifyNGOAuthentication auth = new VerifyNGOAuthentication();
 boolean verify =auth.isVerifyNGO(asd);
 
 if(verify){
     response.sendRedirect("admin.jsp");
 }else{
     response.sendRedirect("VerifyNGO.jsp");
 }
    }
   
}
