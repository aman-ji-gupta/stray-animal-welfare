<%-- 
    Document   : DeleteFaculty
    Created on : 27 Feb, 2022, 9:39:09 AM
    Author     : Lenovo
--%>
<%@page import="dto.VerifyNGODTO"%>
<%@page import="dao.VerifyNGODAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete NGO</title>
    <link rel="stylesheet" href="css/VerifyNGO.css">
</head>
<body>
    <div class="container">
        <div class="login">
            <form action="VerifyNGO" method="post">
                <div id="ngoheading">  <h3> Verify NGO Record</h3>
                 <hr>
                </div>
               
                
               
            </form>
            
                      <%
       




            VerifyNGODAO usd = new VerifyNGODAO();
            VerifyNGODTO asd = usd.getNGOData();
            %>
            
            <form action="VerifyNGOData" method="post">
          <table width="1200" border="solid" id="ngotable">
              <tr>
                 <td><strong>Pincode</strong></td>
                  <td><strong>Name</strong></td>
                  <td><strong>Description</strong></td>
                  <td><strong>Contact</strong></td>
                  <td><strong>Address</strong></td>
                  <td><strong>Verification Status</strong></td>
                     </tr>
              
              
            <tr> 
                <td><strong><%= asd.getPincode()%></strong></td>
                <td><strong><%= asd.getName() %> </strong></td>
                <td><strong><%= asd.getDiscription()%></strong></td>
                <td><strong><%= asd.getContact() %> <input type="hidden" value="<%= asd.getContact()%>" name="contact"> </strong></td>
                <td><strong><%= asd.getAddress()%> </strong></td>
               
                
                <td><strong><button formaction="VerifyNGOData">Verify</button></strong></td>
            </tr>
             </table>
                </form>
                <br>
        

        </div>
        
    </div>
 
            
</body>
</html>