/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "VerifyNGO", urlPatterns = {"/VerifyNGO"})
public class VerifyNGO extends HttpServlet {


    protected void doGet(HttpServletRequest request , HttpServletResponse response)  throws ServletException, IOException{
          response.sendRedirect("index.jsp");
    }
    
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
          
        
        response.sendRedirect("VerifyNGO.jsp");
    }
    

}
