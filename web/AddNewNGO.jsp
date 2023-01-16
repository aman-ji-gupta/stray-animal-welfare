
<%-- 
    Document   : AddNewFaculty
    Created on : 13 Feb, 2022, 11:16:33 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>New NGO Registration</title>
  <link rel="stylesheet" href="css/AddNewNGO.css">
   <!-- Font Awesome Cdn Link -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>
  <div class="wrapper">
      <h3>NGO Registration Form <br/></h3>
    <p>Enter NGO Details..!</p>
    <form action="AddNewNGO" method="POST">
        <label>Pincode</label>
        <input type="text" placeholder="ex: 452002" name="pincode">
      <label>NGO Name</label>
      <input type="text" placeholder="NGO Name" name="name">
      <label>Description</label>
      <input type="textarea" name="description">
      <label>Contact number</label>
      <input type="text" placeholder="Ex: 7999901077" name="contact">
       <label>Address</label>
      <input type="text" placeholder="Ex: xyz indore" name="address">
      
      <button>Submit</button>
      
    </form>
    
  
  </div>
</body>
</html>

