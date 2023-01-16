<%-- 
    Document   : UpdateStudentData
    Created on : 15 Feb, 2022, 1:33:18 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.UpdateNgoDAO"%>
<%@page import="dto.UpdateNgoDTO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update NGO</title>
    <link rel="stylesheet" href="css/updateNgoData.css">
</head>
<body>
    <div class="container">
        <div class="login">
            <form action="UpdateNgoData" method="post" >
                <h2 style="text-align: center;">UPDATE FORM</h2>
                <hr>
                
                <% 
                
                   String contact =(String)session.getAttribute("contact");
              if(contact==null){
                  response.sendRedirect("index.jsp");
              }
                    UpdateNgoDAO usd = new UpdateNgoDAO();
            UpdateNgoDTO asd = usd.getNgoData(contact);
                %>
                
                
                <p>Edit Details Below..!</p>
                <label>Pincode</label>
                <input type="text"  name="pincode" value="<%= asd.getPin_code()%>"/>
        <label>Name</label>
        <input type="text"  name="name" value="<%= asd.getName() %>"/>
      
         <label>Contact Number</label>
         <input type="text" name="contact" value="<%= asd.getContact() %>" />
        <label>Address</label>
        <input type="text"  name="address" value="<%= asd.getAddress() %>"/>
        <label>Description</label>
        <input type="text" name="description" value="<%= asd.getDescription()    %>"/>
        
                
                <button>Submit</button>
                
            </form>
        </div>
        <div class="pic">
            <img src="/pic/image.jpg" alt="In Future NGO image will be displayed here..">
        </div>
    </div>

</body>
</html>
