<%@page import="dto.LoginDTO"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Admin Section</title>
    <link rel="stylesheet" href="css/admin.css">
    <title>Admin Page</title>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  </head>
  <body>
      
          <% 
            //yha humne jo username teslogin servlet ke session me set kiya tha usko yha se get krke print kr denge..agr pehli bar koi direct home page open krega to wo null return krega to agr null hoga to hum use login page pe bhej denge is se page ki security thodi sio bad jayeegi
            String email =(String)session.getAttribute("email");
            if(email==null){
                response.sendRedirect("index.jsp#login-form");
        } 


        %>
      
      
      <header class="header">

    <a href="#" class="logo"> <i class="fas fa-paw"></i> help </a>

    <nav class="navbar">
        <a href="index.jsp">home</a>
        <a href="index.jsp#about">ngo</a>
<!--        <a href="#shop">shop</a>
        <a href="#services">services</a>-->
<!--        <a href="#plan">ngo</a>-->
        <a href="index.jsp#contact">contact</a>
    </nav>

    <div class="icons">
<!--        <div class="fas fa-bars" id="menu-btn"></div>
        <a href="#" class="fas fa-shopping-cart"></a>
        <div class="fas fa-user" id="login-btn"></div>-->
    </div>

    <form action="Login" method="post" class="login-form">
        <h3>sign in</h3>
        <input type="email" name="email" placeholder="enter your email" id="" class="box">
        <input type="password" name="password" placeholder="enter your password" id="" class="box">
        <div class="remember">
            <input type="checkbox" name="" id="remember-me">
            <label for="remember-me">remember me</label>
        </div>
        <input type="submit" value="sign in" class="btn">
        <div class="links">
            <a href="#">forget password</a>
            <a href="#">sign up</a>
        </div>
    </form>

</header>
      
      
      
      
      
     
    <div class="wrapper">
      <h1 style="text-align: center ; font-size: 25px;">-- Admin Section --</h1>
      <div class="about-section">
        <img src="image/animal.jpg" />
        <form>
       
             <h3 style="text-align: center ; font-size: 20px;">Welcome Admin...! <br> </h3>
            <p style="text-align: center ; font-size: 18px;"> Choose What do you want to do from below list..    <br />
                
                <button formaction="AddNewNGO"><b>ADD NEW NGO</b></button>
                <button formaction="updateNgo.jsp"><b>UPDATE NGO</b></button>
          <button formaction="DeleteNGO.jsp"><b>DELETE NGO</b></button>
          <button formaction="VerifyNGO.jsp"><b>Verify NGO</b></button>
         

            
            
            </p>
        </form>
      </div>
    </div
    
    
 

  </body>
</html>
