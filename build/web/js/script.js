let loginForm = document.querySelector('.header .login-form');



let map;

function initMap() {
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: -34.397, lng: 150.644 },
    zoom: 8,
  });
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







document.querySelector('#login-btn').onclick = () =>{
    loginForm.classList.toggle('active');
    navbar.classList.remove('active');
}

let navbar = document.querySelector('.header .navbar');

document.querySelector('#menu-btn').onclick = () =>{
    navbar.classList.toggle('active');    
    loginForm.classList.remove('active');
}

window.onscroll = () =>{
    loginForm.classList.remove('active');
    navbar.classList.remove('active');

    if(window.scrollY > 0){
        document.querySelector('.header').classList.add('active');
    }else{
        document.querySelector('.header').classList.remove('active');
    }
}

window.onload = () =>{
    if(window.scrollY > 0){
        document.querySelector('.header').classList.add('active');
    }else{
        document.querySelector('.header').classList.remove('active');
    }
}