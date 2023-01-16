/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.RegisterAdminDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RegisterAdminAuthentication;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "RegisterAdmin", urlPatterns = {"/RegisterAdmin"})
public class RegisterAdmin extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
           response.sendRedirect("index.jsp");
        }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           String email = request.getParameter("email");
           String contact = request.getParameter("contact");
           
           RegisterAdminDTO regdto = new RegisterAdminDTO();
           regdto.setUsername(username);
           regdto.setContact(contact);
           regdto.setEmail(email);
           regdto.setPassword(password);
           
           
           RegisterAdminAuthentication auth = new RegisterAdminAuthentication();
           
           boolean register = auth.isRegister(regdto);
           
           if(register){
               response.sendRedirect("index.jsp");
           }else{
               response.sendRedirect("RegisterAdmin.jsp");
           }
           
        }
}
