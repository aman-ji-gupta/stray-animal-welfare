/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.LoginDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.LoginAuthentication;

/**
 *
 * @author Lenovo
 */
public class Login extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("index.jsp");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        HttpSession session = request.getSession();
         session.setAttribute("email", email);
        
        LoginDTO ldto = new LoginDTO();
        ldto.setEmail(email);
        ldto.setPassword(password);
        
        
        LoginAuthentication la = new LoginAuthentication();
        boolean ans = la.islogin(ldto);
        
        if(ans){
            response.sendRedirect("admin.jsp");
        }
        else{
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Incorrect Username OR password..","Error",JOptionPane.ERROR_MESSAGE);
        response.sendRedirect("index.jsp");
        }
        
        
        
        
        
        
    }

  
}
