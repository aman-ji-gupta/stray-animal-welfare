<%-- 
    Document   : NGORequestForm
    Created on : 16 Sep, 2022, 3:15:58 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NGO Request Form</title>
         <link rel="stylesheet" href=""> 
        <link rel="stylesheet" href="css/NGORequestForm.css">
        <script src="https://use.fontawesome.com/4ecc3dbb0b.js"></script>
        
    </head>
    <body>
      <div class="form_wrapper">
  <div class="form_container">
    <div class="title_container">
      <h2>NGO Request Form</h2>
    </div>
    <div class="row clearfix">
      <div class="">
          <form action="NGORequestForm" method="post" onsubmit="return isTrue()">
          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
              <input type="text" id="name" name="ngoname" placeholder="NGO Name" required />
             <p class="error" id="nameerror"></p>
          </div>
            <div class="input_field"> <span><i aria-hidden="true"  class="fa fa-user " ></i></span>
            <input type="text" id="address" name="ngoaddress" placeholder="NGO Address" required />
            <p class="error" id="adderror"></p>
          </div>
          <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
            <input type="text" id="pincode" name="ngopincode" placeholder="Pin Code" required />
            <p class="error" id="pinerror"></p>
          </div>
         <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
            <input type="text" id="discription" name="ngodescription" placeholder="NGO Description" required />
            <p class="error" id="discriptionerror"></p>
          </div>
            <div class="input_field"> <span><i aria-hidden="true" class="fa fa-user"></i></span>
            <input type="text" id="contact" name="ngocontact" placeholder="NGO Contact Number" required />
            <p class="error" id="contacterror"></p>
          </div>
              <input class="button" type="submit" value="Register"  />
              
         
        </form>
      </div>
    </div>
  </div>
</div>
        
        
        <script>
           
            
          
            
            function isTrue(){
                
            var name=document.getElementById("name");
            var add=document.getElementById("address");
            var pin=document.getElementById("pincode");
            var contact=document.getElementById("contact");
            var discription=document.getElementById("discription");
            
                var flag=1;
                if(name.value.length<4){
                    document.getElementById("nameerror").innerHTML="*name should be atleast 4 character";
                    flag=0;
                }else if(add.value.length<4){
                    document.getElementById("adderror").innerHTML="*Address should be atleast 4 character";
                    flag=0;
        }else if(pin.value.length<6){
                    document.getElementById("pinerror").innerHTML="*Pin should be 6 digit";
                    flag=0;
        }else if(contact.value.length<10){
                    document.getElementById("contacterror").innerHTML="*Contact should be 10 digit long";
                    flag=0;
        }else if(discription.value.length<10){
                    document.getElementById("discriptionerror").innerHTML="*NGO description should be atleast 10 character";
                    flag=0;
        }
                
                
              
                
                if(flag){
                      return true;
                }else{
                    return false;
                }
                
            }
            
            
        </script>
        
        
        
        
        
<p class="credit">Developed by <a href="" target="_blank">Aman & Sreshti</a></p>
    </body>
</html>
