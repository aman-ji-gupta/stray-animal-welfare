/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.NGORequestFormDTO;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.NGORequestFormAuthentication;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "NGORequestForm", urlPatterns = {"/NGORequestForm"})
public class NGORequestForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
     response.sendRedirect("NGORequestForm.jsp");
 }
    
    
    
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException
    {
        String ngoname = request.getParameter("ngoname");
        String ngoaddress = request.getParameter("ngoaddress");
        String ngopincode = request.getParameter("ngopincode");
        String ngodescription = request.getParameter("ngodescription");
        String ngocontact = request.getParameter("ngocontact");
        
        
        NGORequestFormDTO requestform = new NGORequestFormDTO();
        requestform.setNgoname(ngoname);
        requestform.setNgoaddress(ngoaddress);
        requestform.setNgodiscription(ngodescription);
        requestform.setNgopincode(ngopincode);
        requestform.setNgocontact(ngocontact);
        
        NGORequestFormAuthentication authentication = new NGORequestFormAuthentication();
        
        boolean auth = authentication.isAddNewNGO(requestform);
        if(auth){
            System.out.println("trueeee");
            response.sendRedirect("index.jsp");
        }else{
             System.out.println("false");
            response.sendRedirect("NGORequestForm.jsp");
        }
        
                
        
    }
    
}
