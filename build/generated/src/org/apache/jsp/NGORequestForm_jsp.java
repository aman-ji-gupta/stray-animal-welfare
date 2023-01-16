package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NGORequestForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>NGO Request Form</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/NGORequestForm.css\">\n");
      out.write("        <script src=\"https://use.fontawesome.com/4ecc3dbb0b.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"form_wrapper\">\n");
      out.write("  <div class=\"form_container\">\n");
      out.write("    <div class=\"title_container\">\n");
      out.write("      <h2>NGO Request Form</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row clearfix\">\n");
      out.write("      <div class=\"\">\n");
      out.write("          <form action=\"NGORequestForm\" method=\"post\" onsubmit=\"return isTrue()\">\n");
      out.write("          <div class=\"input_field\"> <span><i aria-hidden=\"true\" class=\"fa fa-user\"></i></span>\n");
      out.write("              <input type=\"text\" id=\"name\" name=\"ngoname\" placeholder=\"NGO Name\" required />\n");
      out.write("             <p class=\"error\" id=\"nameerror\"></p>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"input_field\"> <span><i aria-hidden=\"true\"  class=\"fa fa-user \" ></i></span>\n");
      out.write("            <input type=\"text\" id=\"address\" name=\"ngoaddress\" placeholder=\"NGO Address\" required />\n");
      out.write("            <p class=\"error\" id=\"adderror\"></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input_field\"> <span><i aria-hidden=\"true\" class=\"fa fa-user\"></i></span>\n");
      out.write("            <input type=\"text\" id=\"pincode\" name=\"ngopincode\" placeholder=\"Pin Code\" required />\n");
      out.write("            <p class=\"error\" id=\"pinerror\"></p>\n");
      out.write("          </div>\n");
      out.write("         <div class=\"input_field\"> <span><i aria-hidden=\"true\" class=\"fa fa-user\"></i></span>\n");
      out.write("            <input type=\"text\" id=\"discription\" name=\"ngodescription\" placeholder=\"NGO Description\" required />\n");
      out.write("            <p class=\"error\" id=\"discriptionerror\"></p>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"input_field\"> <span><i aria-hidden=\"true\" class=\"fa fa-user\"></i></span>\n");
      out.write("            <input type=\"text\" id=\"contact\" name=\"ngocontact\" placeholder=\"NGO Contact Number\" required />\n");
      out.write("            <p class=\"error\" id=\"contacterror\"></p>\n");
      out.write("          </div>\n");
      out.write("              <input class=\"button\" type=\"submit\" value=\"Register\" onclick=\"alert('Request Sent Successfully..NGO details will be shown to portal when admin verfies it')\" />\n");
      out.write("              \n");
      out.write("         \n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var name=document.getElementById(\"name\");\n");
      out.write("            var add=document.getElementById(\"address\");\n");
      out.write("            var pin=document.getElementById(\"pincode\");\n");
      out.write("            var contact=document.getElementById(\"contact\");\n");
      out.write("            var discription=document.getElementById(\"discription\");\n");
      out.write("            \n");
      out.write("            function isTrue(){\n");
      out.write("                \n");
      out.write("                if(name.value.length<=7){\n");
      out.write("                    document.getElementById(\"nameerror\").innerHTML=\"*name should be atleast 3 character\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<p class=\"credit\">Developed by <a href=\"\" target=\"_blank\">Aman & Sreshti</a></p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
