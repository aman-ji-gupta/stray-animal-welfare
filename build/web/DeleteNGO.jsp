<%-- 
    Document   : DeleteFaculty
    Created on : 27 Feb, 2022, 9:39:09 AM
    Author     : Lenovo
--%>

<%@page import="dto.DeleteNGODTO"%>
<%@page import="dao.DeleteNGODAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete NGO</title>
    <link rel="stylesheet" href="css/DeleteNGO.css">
</head>
<body>
    <div class="container">
        <div class="login">
            <form action="DeleteNGO" method="post">
                <h3>Delete NGO Record</h3>
                <hr>
                <br><br><br>
                <label>Contact Number</label>
                <input type="text" placeholder="Enter Contact Number" name="contact">
                
                <button>Submit</button>
            </form>
            
            <% 
                String contact =(String)session.getAttribute("contact");
              if(contact==null){
                  %>
                  <table>
                      <tr>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                          <td></td>
                               
                      </tr>
                      
                  </table>
            
            
            <%
        } else{




            DeleteNGODAO usd = new DeleteNGODAO();
            DeleteNGODTO asd = usd.getNGOData(contact);
            %>
            
           
          <table width="1200" border="solid">
              <tr>
                 <td><strong>pincode</strong></td>
                  <td><strong>Name</strong></td>
                  <td><strong>Description</strong></td>
                  <td><strong>Contact</strong></td>
                  <td><strong>Address</strong></td>
                     </tr>
              
              
            <tr> 
              <td><strong><%= asd.getPincode()%> </strong></td>
                <td><strong><%= asd.getName() %> </strong></td>
                <td><strong><%= asd.getDiscription()%> </strong></td>
                <td><strong><%= asd.getContact() %> </strong></td>
                <td><strong><%= asd.getAddress()%> </strong></td>
               
                
                <td><strong><a href="DeleteNGOData" class="update"> Delete</a> </strong></td>
            </tr>
             </table>
                <br>
        
                <% }%>
        </div>
        
    </div>
 
            
</body>
</html>