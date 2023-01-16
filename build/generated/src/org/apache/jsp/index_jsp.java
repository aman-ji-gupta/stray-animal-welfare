package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import dto.DisplayNGODTO;
import dao.DisplayNGODAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Stray Animal Welfare</title>\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <style>\n");
      out.write("            .error{\n");
      out.write("             margin: 0px;\n");
      out.write("            text-align: left;\n");
      out.write("            margin-left: 11px;\n");
      out.write("            color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- header section starts  -->\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"logo\"> <i class=\"fas fa-paw\"></i> help!!! </a>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"#home\">home</a>\n");
      out.write("                <a href=\"#about\">ngo</a>\n");
      out.write("                <!--        <a href=\"#shop\">shop</a>\n");
      out.write("                        <a href=\"#services\">services</a>\n");
      out.write("                        <a href=\"#plan\">plan</a>-->            \n");
      out.write("                 <a href=\"#contact\">contact</a>\n");
      out.write("                  <a href=\"NGORequestForm\">Join Us</a>\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <div class=\"fas fa-bars\" id=\"menu-btn\"></div>\n");
      out.write("                <!--        <a href=\"#\" class=\"fas fa-shopping-cart\"></a>-->\n");
      out.write("                <div class=\"fas fa-user\" id=\"login-btn\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"Login\" method=\"post\" class=\"login-form\" onclick=\"return checkloginvalidation()\">\n");
      out.write("                <h3>sign in</h3>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"enter your email\" id=\"email\" class=\"box\">\n");
      out.write("                <p id=\"emailerror\" class=\"error\"></p>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"enter your password\" id=\"password\" class=\"box\">\n");
      out.write("                <p id=\"paserror\" class=\"error\"></p>\n");
      out.write("                <div class=\"remember\">\n");
      out.write("                    <input type=\"checkbox\" name=\"\" id=\"remember-me\">\n");
      out.write("                    <label for=\"remember-me\">remember me</label>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"sign in\" class=\"btn\">\n");
      out.write("                <div class=\"links\">\n");
      out.write("                    <a href=\"#\">forget password</a>\n");
      out.write("                    <a href=\"RegisterAdmin.jsp\">sign up</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- header section ends -->\n");
      out.write("\n");
      out.write("        <!-- home section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3> <span>hi</span> welcome to Stray Animal Welfare </h3>\n");
      out.write("                <!--        <a href=\"#\" class=\"btn\">shop now</a>-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <img src=\"image/bottom_wave.png\" class=\"wave\" alt=\"\">\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- home section ends -->\n");
      out.write("\n");
      out.write("        <!-- about section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"about\" id=\"about\">\n");
      out.write("\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"image/cat3.jpg\" height=\"400\"   alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>About <span>Stray Animal</span> Welfare</h3>\n");
      out.write("                <p> A web Portal that provides help to stray animals. Our Portal will contain many NGOs that are already helping the stray animals community.\n");
      out.write("                </p>\n");
      out.write("                <form action=\"DisplayNGO\" method=\"post\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your pincode\" name=\"pincode\" class=\"btn\"/>\n");
      out.write("                    <br/>\n");
      out.write("                    <input type=\"submit\" value=\"submit\" class=\"btn\" />\n");
      out.write("\n");
      out.write("                </form>    </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("          <section class=\"about\" id=\"about\">\n");
      out.write("\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"image/doctor.png\" height=\"400\" width=\"200\"   alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>Search <span>Nearby </span> Doctors</h3>\n");
      out.write("                <p> You can find the doctors that are already helping stray animals at free of of cost. Just enter your pincode below to find nearby doctors  </p>\n");
      out.write("                <form action=\"\" method=\"post\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your pincode\" name=\"pincode\" class=\"btn\"/>\n");
      out.write("                    <br/>\n");
      out.write("                    <input type=\"submit\" value=\"submit\" class=\"btn\" />\n");
      out.write("\n");
      out.write("                </form>    </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- about section ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- plan section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"plan\" id=\"plan\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                String pincode = (String) session.getAttribute("pincode");
                System.out.println(pincode);
                if (pincode != null) 
                {
                    DisplayNGODAO user = new DisplayNGODAO();
                    List<DisplayNGODTO> listofngo = user.getAllNGOData(pincode);
                    Iterator<DisplayNGODTO> itr = listofngo.iterator();
                   
                    
                    if (listofngo.size() == 0)
                    {
      out.write("\n");
      out.write("                          <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3 class=\"title\">sorry..! No NGO found for this pincode..</h3>\n");
      out.write("                </div> </div>\n");
      out.write("                          ");

                    } 
                    else 
                    {
                        while (itr.hasNext()) 
                        {
                        
                            DisplayNGODTO asd = itr.next();
            
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3 class=\"title\">NGO</h3>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <h2 class=\"ngo\">");
      out.print( asd.getNgo_name());
      out.write("</h2>\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <h3 class=\"ngo\" id=\"ngo1\">Description</h3>\n");
      out.write("                    <br>\n");
      out.write("                    <h2 class=\"ngo\"> ");
      out.print( asd.getDiscription());
      out.write(" </h2>\n");
      out.write("                    <br>\n");
      out.write("                    <h3 class=\"ngo\" id=\"ngo1\">Contact</h3>\n");
      out.write("                    <br>\n");
      out.write("                    <h2 class=\"ngo\">");
      out.print( asd.getContact());
      out.write("</h2>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <h3 class=\"ngo\" id=\"ngo1\">Address</h3>\n");
      out.write("                    <br>\n");
      out.write("                    <h2 class=\"ngo\">");
      out.print( asd.getAddress());
      out.write("</h2>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
 }
            }
}

      out.write("\n");
      out.write("           \n");
      out.write("         \n");
      out.write("               \n");
      out.write("           \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- plan section ends -->\n");
      out.write("\n");
      out.write("        <section class=\"contact\" id=\"contact\">\n");
      out.write("\n");
      out.write("            <div class=\"image\">\n");
      out.write("                <img src=\"image/contact_img.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"ContactUs\" method=\"post\">\n");
      out.write("                <h3>contact us</h3>\n");
      out.write("                <input type=\"text\" placeholder=\"your name\" class=\"box\" name=\"name\">\n");
      out.write("                <input type=\"text\" placeholder=\"your email\" class=\"box\" name=\"email\">\n");
      out.write("                <input type=\"text\" placeholder=\"your number\" class=\"box\" name=\"contact\">\n");
      out.write("                <textarea placeholder=\"your message\" id=\"\" cols=\"30\" rows=\"10\" name=\"message\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"send message\" class=\"btn\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"footer\">\n");
      out.write("\n");
      out.write("            <img src=\"image/top_wave.png\" alt=\"\">\n");
      out.write("\n");
      out.write("            <div class=\"share\">\n");
      out.write("                <a href=\"https://www.facebook.com/groups/strayanimaladoptionprogram\" class=\"btn\"> <i class=\"fab fa-facebook-f\"></i> facebook </a>\n");
      out.write("                <a href=\"https://twitter.com/wsdindia\" class=\"btn\"> <i class=\"fab fa-twitter\"></i> twitter </a>\n");
      out.write("                <a href=\"https://www.instagram.com/awsindore/?hl=en\" class=\"btn\"> <i class=\"fab fa-instagram\"></i> instagram </a>\n");
      out.write("                <a href=\"https://www.linkedin.com/company/animal-welfare-society?challengeId=AQGNTxHpeZM2MAAAAYBxI1oWUAzCGp0VsYli6BLKgqdVQi298uNAK7Y3-iVSoeeDdZQ8vqimeu56kCmkuWzqfRKm7jSY2Tjw9g&submissionId=f1e48ca2-591e-ea16-5cf7-135fd967fe13\" class=\"btn\"> <i class=\"fab fa-linkedin\"></i> linkedin </a>\n");
      out.write("                <a href=\"https://in.pinterest.com/kipluck/animal-welfare-animal-rights/\" class=\"btn\"> <i class=\"fab fa-pinterest\"></i> pinterest </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"credit\"> created by <span> Aman & Sreshti </span> | all rights reserved! </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- custom js file link  -->\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function checkloginvalidation(){\n");
      out.write("              var email= document.getElementById(\"email\");\n");
      out.write("              var password= document.getElementById(\"password\");\n");
      out.write("              var flag=1;\n");
      out.write("              if(username.value==\"\"){\n");
      out.write("                  document.getElementById(\"emailerror\").innerHTML=\"*Email Cant be empty\";\n");
      out.write("                  flag=0;\n");
      out.write("              }\n");
      out.write("              \n");
      out.write("              if(flag){\n");
      out.write("                  return true;\n");
      out.write("              }else{\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
