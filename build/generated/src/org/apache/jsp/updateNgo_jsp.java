package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.UpdateNgoDTO;
import dao.UpdateNgoDAO;

public final class updateNgo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Login Form | By Code Info</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/updateNgo.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"UpdateNgo\" method=\"post\">\n");
      out.write("                <h3>Update Ngo Record</h3>\n");
      out.write("                <hr>\n");
      out.write("                <br><br><br>\n");
      out.write("                <label>Contact Number</label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter NGO's Contact number\" name=\"enrollment\">\n");
      out.write("                \n");
      out.write("                <button formaction=\"UpdateNgo\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            ");
 
                String contact =(String)session.getAttribute("contact");
              if(contact==null){
                  
      out.write("\n");
      out.write("                  <table>\n");
      out.write("                      <tr>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                          <td></td>\n");
      out.write("                               \n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                  </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

        } else{




            UpdateNgoDAO usd = new UpdateNgoDAO();
            UpdateNgoDTO asd = usd.getNgoData(contact);
            
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          <table width=\"1200\" border=\"solid\">\n");
      out.write("              <tr>\n");
      out.write("                  <td><strong>PinCode</strong></td>\n");
      out.write("                  <td><strong>Name</strong></td>\n");
      out.write("                  <td><strong>Description</strong></td>\n");
      out.write("              \n");
      out.write("                 <td><strong>Contact</strong></td>\n");
      out.write("                  <td><strong>Address</strong></td>\n");
      out.write("                  <td><strong>DOB</strong></td>\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                      </tr>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <tr> \n");
      out.write("                <td><strong>");
      out.print( asd.getPin_code() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getName() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getContact() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getAddress() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getDescription() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong><a href=\"updateNgoData.jsp\" class=\"update\"> Update</a> </strong></td>\n");
      out.write("            </tr>\n");
      out.write("             </table>\n");
      out.write("                <br>\n");
      out.write("        \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("            \n");
      out.write("</body>\n");
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
