
<%-- 
    Document   : update
    Created on : 15 Feb, 2022, 11:11:45 AM
    Author     : Lenovo
--%>

<%@page import="dto.UpdateNgoDTO"%>
<%@page import="dao.UpdateNgoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update NGO</title>
    <link rel="stylesheet" href="css/updateNgo.css">
</head>
<body>
    <div class="container">
        <div class="login">
            <form action="UpdateNgo" method="post">
                <h3>Update Ngo Record</h3>
                <hr>
                <br><br><br>
                <label>Contact Number</label>
                <input type="text" placeholder="Enter NGO's Contact number" name="contact">
                
                <button formaction="UpdateNgo">Submit</button>
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




            UpdateNgoDAO usd = new UpdateNgoDAO();
            UpdateNgoDTO asd = usd.getNgoData(contact);
            %>
            
           
          <table width="1200" border="solid">
              <tr>
                  <td><strong>PinCode</strong></td>
                  <td><strong>Name</strong></td>
                  <td><strong>Contact</strong></td>
              
                 <td><strong>Address</strong></td>
                  <td><strong>Description</strong></td>
            
                         
                          
                          
                          
                      </tr>
              
              
            <tr> 
                <td><strong><%= asd.getPin_code() %> </strong></td>
                <td><strong><%= asd.getName() %> </strong></td>
                <td><strong><%= asd.getContact() %> </strong></td>
                <td><strong><%= asd.getAddress() %> </strong></td>
                <td><strong><%= asd.getDescription() %> </strong></td>
                <td><strong><a href="updateNgoData.jsp" class="update"> Update</a> </strong></td>
            </tr>
             </table>
                <br>
        
                <% }%>
        </div>
        
    </div>
 
            
</body>
</html>