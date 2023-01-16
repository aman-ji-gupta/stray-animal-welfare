package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <title>Admin Section</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write(" \n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <header class=\"header\">\n");
      out.write("\n");
      out.write("    <a href=\"#\" class=\"logo\"> <i class=\"fas fa-paw\"></i> help </a>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <a href=\"index.jsp\">home</a>\n");
      out.write("        <a href=\"index.jsp#about\">ngo</a>\n");
      out.write("<!--        <a href=\"#shop\">shop</a>\n");
      out.write("        <a href=\"#services\">services</a>-->\n");
      out.write("<!--        <a href=\"#plan\">ngo</a>-->\n");
      out.write("        <a href=\"index.jsp#contact\">contact</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"icons\">\n");
      out.write("<!--        <div class=\"fas fa-bars\" id=\"menu-btn\"></div>\n");
      out.write("        <a href=\"#\" class=\"fas fa-shopping-cart\"></a>\n");
      out.write("        <div class=\"fas fa-user\" id=\"login-btn\"></div>-->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form action=\"Login\" method=\"post\" class=\"login-form\">\n");
      out.write("        <h3>sign in</h3>\n");
      out.write("        <input type=\"email\" name=\"email\" placeholder=\"enter your email\" id=\"\" class=\"box\">\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"enter your password\" id=\"\" class=\"box\">\n");
      out.write("        <div class=\"remember\">\n");
      out.write("            <input type=\"checkbox\" name=\"\" id=\"remember-me\">\n");
      out.write("            <label for=\"remember-me\">remember me</label>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" value=\"sign in\" class=\"btn\">\n");
      out.write("        <div class=\"links\">\n");
      out.write("            <a href=\"#\">forget password</a>\n");
      out.write("            <a href=\"#\">sign up</a>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("     \n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("      <h1>-- Admin Section --</h1>\n");
      out.write("      <div class=\"about-section\">\n");
      out.write("        <img src=\"image/animal.jpg\" />\n");
      out.write("        <form>\n");
      out.write("       \n");
      out.write("             <h3 style=\"text-align: center\">Welcome Admin...! <br> </h3>\n");
      out.write("            <p> Choose What do you want to do from below list..    <br />\n");
      out.write("                \n");
      out.write("                <button formaction=\"AddNewNGO\"><b>ADD NEW NGO</b></button>\n");
      out.write("                <button formaction=\"updateNgo.jsp\"><b>UPDATE NGO</b></button>\n");
      out.write("          <button formaction=\"DeleteNGO.jsp\"><b>DELETE NGO</b></button>\n");
      out.write("         \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" \n");
      out.write("\n");
      out.write("  </body>\n");
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
