<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="dto.DisplayNGODTO"%>
<%@page import="dao.DisplayNGODAO"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Stray Animal Welfare</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/style.css">
        <style>
            .error{
             margin: 0px;
            text-align: left;
            margin-left: 11px;
            color: red;
            }
        </style>
    </head>
    <body>

        <!-- header section starts  -->

        <header class="header">

            <a href="#" class="logo"> <i class="fas fa-paw"></i> help!!! </a>

            <nav class="navbar">
                <a href="#home">home</a>
                <a href="#about">ngo</a>
                <!--        <a href="#shop">shop</a>
                        <a href="#services">services</a>
                        <a href="#plan">plan</a>-->            
                 <a href="#contact">contact</a>
                  <a href="NGORequestForm">Join Us</a>
                  
                
            </nav>

            <div class="icons">
                <div class="fas fa-bars" id="menu-btn"></div>
                <!--        <a href="#" class="fas fa-shopping-cart"></a>-->
                <div class="fas fa-user" id="login-btn"></div>
            </div>

            <form action="Login" method="post" class="login-form" onsubmit="return validate()">
                <h3>sign in</h3>
                <input type="email" name="email" placeholder="enter your email" id="email" class="box">
                <p id="eerror" class="error"></p>
                <input type="password" name="password" placeholder="enter your password" id="password" class="box">
                <p id="perror" class="error"></p>
                <div class="remember">
                    <input type="checkbox" name="" id="remember-me">
                    <label for="remember-me">remember me</label>
                </div>
                <input type="submit" value="sign in" class="btn">
                <div class="links">
                    <a href="#">forget password</a>
                    <a href="RegisterAdmin.jsp">sign up</a>
                </div>
            </form>

        </header>

        <!-- header section ends -->

        <!-- home section starts  -->

        <section class="home" id="home">

           


<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

            
            
            <div class="content">
                <h3> <span>hi</span> welcome to Stray Animal Welfare </h3>
                <!--        <a href="#" class="btn">shop now</a>-->
            </div>

            <img src="image/bottom_wave.png" class="wave" alt="">

        </section>

        <!-- home section ends -->

        <!-- about section starts  -->

        <section class="about" id="about">

            <div class="image">
                <img src="image/cat3.jpg" height="400"   alt="">
            </div>

            <div class="content">
                <h3>About <span>Stray Animal</span> Welfare</h3>
                <p> A web Portal that provides help to stray animals. Our Portal will contain many NGOs that are already helping the stray animals community.
                </p>
                <form action="DisplayNGO" method="post" onsubmit="return pincodeChecker()">
                    <input type="text" placeholder="Enter your pincode" name="pincode" class="btn" id="pincode"/>
                     <p id="pinerror" class="error"></p>
                    <br/>
                    <input type="submit" value="submit" class="btn"  />

                </form>    </div>

        </section>

          <section class="about" id="about">

            <div class="image">
                <img src="image/doctor.png" height="400" width="200"   alt="">
            </div>

            <div class="content">
                <h3>Search <span>Nearby </span> Doctors</h3>
                <p> You can find the doctors that are already helping stray animals at free of of cost. Just enter your pincode below to find nearby doctors  </p>
                <form action="" method="post" onsubmit="return pincodeChecker1()">
                    <input type="text" placeholder="Enter your pincode" name="pincode" class="btn" id="pin2"/>
                    <p id="pinerror1" class="error"></p>
                    <br/>
                    <input type="submit" value="submit" class="btn" />

                </form>    </div>

        </section>
        <!-- about section ends -->



        <!-- plan section starts  -->

        <section class="plan" id="plan">







            <%
                String pincode = (String) session.getAttribute("pincode");
                System.out.println(pincode);
                if (pincode != null) 
                {
                    DisplayNGODAO user = new DisplayNGODAO();
                    List<DisplayNGODTO> listofngo = user.getAllNGOData(pincode);
                    Iterator<DisplayNGODTO> itr = listofngo.iterator();
                   
                    
                    if (listofngo.size() == 0)
                    {%>
                          <div class="box-container">
                <div class="box">
                    <h3 class="title">sorry..! No NGO found for this pincode..</h3>
                </div> </div>
                          <%
                    } 
                    else 
                    {
                        while (itr.hasNext()) 
                        {
                        
                            DisplayNGODTO asd = itr.next();
            %>
            <div class="box-container">
                <div class="box">
                    <h3 class="title">NGO</h3>
                    <br/><br/>
                    <h2 class="ngo"><%= asd.getNgo_name()%></h2>
                    <br/><br/><br/>
                    <h3 class="ngo" id="ngo1">Description</h3>
                    <br>
                    <h2 class="ngo"> <%= asd.getDiscription()%> </h2>
                    <br>
                    <h3 class="ngo" id="ngo1">Contact</h3>
                    <br>
                    <h2 class="ngo"><%= asd.getContact()%></h2>

                    <br>
                    <h3 class="ngo" id="ngo1">Address</h3>
                    <br>
                    <h2 class="ngo"><%= asd.getAddress()%></h2>

                </div>


            </div>
            <% }
            }
}
%>
           
         
               
           
        </section>



        <!-- plan section ends -->

        <section class="contact" id="contact">

            <div class="image">
                <img src="image/contact_img.png" alt="">
            </div>

            <form action="ContactUs" method="post" onsubmit="return isValidContact()">
                <h3>contact us</h3>
                <input type="text" id="name" placeholder="your name" class="box" name="name">
                <p class="error" id="nameerror"></p>
                <input type="text" id="email1" placeholder="your email" class="box" name="email">
                <p class="error" id="emailerror"></p>
                <input type="text" id="contact1" placeholder="your number" class="box" name="contact">
                <p class="error" id="contacterror"></p>
                <textarea  id="message" placeholder="your message" id="" cols="30" rows="10" name="message"></textarea>
                <p class="error" id="messageerror"></p>
                <input type="submit" value="send message" class="btn">
            </form>

          
        </section>

        <section class="footer">

            <img src="image/top_wave.png" alt="">

            <div class="share">
                <a href="https://www.facebook.com/groups/strayanimaladoptionprogram" class="btn"> <i class="fab fa-facebook-f"></i> facebook </a>
                <a href="https://twitter.com/wsdindia" class="btn"> <i class="fab fa-twitter"></i> twitter </a>
                <a href="https://www.instagram.com/awsindore/?hl=en" class="btn"> <i class="fab fa-instagram"></i> instagram </a>
                <a href="https://www.linkedin.com/company/animal-welfare-society?challengeId=AQGNTxHpeZM2MAAAAYBxI1oWUAzCGp0VsYli6BLKgqdVQi298uNAK7Y3-iVSoeeDdZQ8vqimeu56kCmkuWzqfRKm7jSY2Tjw9g&submissionId=f1e48ca2-591e-ea16-5cf7-135fd967fe13" class="btn"> <i class="fab fa-linkedin"></i> linkedin </a>
                <a href="https://in.pinterest.com/kipluck/animal-welfare-animal-rights/" class="btn"> <i class="fab fa-pinterest"></i> pinterest </a>
            </div>

            <div class="credit"> created by <span> Aman & Sreshti </span> | all rights reserved! </div>

        </section>




        <script>
            
            function pincodeChecker(){
                var pincode=document.getElementById("pincode");
                if(pincode.value==""){
                    document.getElementById("pinerror").innerHTML="*pincode can't be empty";
                    console.log("empty pincode");
                    return false;
                }else if(pincode.value.length<6){
                    document.getElementById("pinerror").innerHTML="*pincode should be of 6 digit number";
                    return false;
                }
                return true;
            }
            function pincodeChecker1(){
                  var pin2=document.getElementById("pin2");
                
                if(pin2.value==""){
                    document.getElementById("pinerror1").innerHTML="*pincode can't be empty";
                    console.log("empty pincode");
                    return false;
                }else if(pin2.value.length<6){
                     document.getElementById("pinerror1").innerHTML="*pincode should be of 6 digit number";
                     return false;
                     
                }
                return true;
            }
            
            
            
            
             function validate(){
     var email=document.getElementById("email");
    var password=document.getElementById("password");
    var flag=1;
    if(email.value==""){
         document.getElementById("eerror").innerHTML="*email can not be empty";
         console.log("email empty");
        flag=0;
    }
    
    
    
    if(password.value==""){
        document.getElementById("perror").innerHTML="*password can not be empty";
        flag=0;
    }
    
   
    if(flag){
        return true;
    }else{
        return false;
    }
        }
        
        
        
        
        function isValidContact(){
            var name = document.getElementById("name");
            var contact = document.getElementById("contact1");
            var email=document.getElementById("email");
            var message=document.getElementById("message");
            const str=document.getElementById("email").value;
            console.log(str);
            var flag=1;
            
               if(name.value.length==""){
                document.getElementById("nameerror").innerHTML="*Name Cant not be blank";
                
                flag=0;
               }else if(name.value.length <3){
                document.getElementById("nameerror").innerHTML="*Name should be min. 3 character long";
                flag=0;
                        }else if(email1.value.length==""){
                document.getElementById("emailerror").innerHTML="*email cant be blank";
                flag=0;
                }   
                else if(contact1.value.length==""){
                    document.getElementById("contacterror").innerHTML="*Contact number can not be blank";
                    flag=0;
                }else if(contact1.value.length<10){
                     document.getElementById("contacterror").innerHTML="*Contact number should be of 10 digits";
                     flag=0;
                 }else if(message.value.length==""){
                 document.getElementById("messageerror").innerHTML="*msg Can not be blank";
                flag=0;
                }else if(message.value.length <3){
                document.getElementById("messageerror").innerHTML="*Message should be min. 3 character long";
                flag=0;
                }
                
                
            
                
        
        
         console.log(flag);
        
        
        if(flag){
            return true;
        }else{
            return false;
        }
            
        }
        
        
            </script>

        <!-- custom js file link  -->
        <script src="js/script.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
     
    </body>
</html>