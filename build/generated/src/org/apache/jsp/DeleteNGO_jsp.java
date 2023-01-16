package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.DeleteNGODTO;
import dao.DeleteNGODAO;

public final class DeleteNGO_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Delete NGO</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/DeleteNGO.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"DeleteNGO\" method=\"post\">\n");
      out.write("                <h3>Delete NGO Record</h3>\n");
      out.write("                <hr>\n");
      out.write("                <br><br><br>\n");
      out.write("                <label>Contact Number</label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Contact Number\" name=\"contact\">\n");
      out.write("                \n");
      out.write("                <button>Submit</button>\n");
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




            DeleteNGODAO usd = new DeleteNGODAO();
            DeleteNGODTO asd = usd.getNGOData(contact);
            
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          <table width=\"1200\" border=\"solid\">\n");
      out.write("              <tr>\n");
      out.write("                 <td><strong>pincode</strong></td>\n");
      out.write("                  <td><strong>Name</strong></td>\n");
      out.write("                  <td><strong>Description</strong></td>\n");
      out.write("                  <td><strong>Contact</strong></td>\n");
      out.write("                  <td><strong>Address</strong></td>\n");
      out.write("                     </tr>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <tr> \n");
      out.write("              <td><strong>");
      out.print( asd.getPincode());
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getName() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getDiscription());
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getContact() );
      out.write(" </strong></td>\n");
      out.write("                <td><strong>");
      out.print( asd.getAddress());
      out.write(" </strong></td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <td><strong><a href=\"DeleteNGOData\" class=\"update\"> Delete</a> </strong></td>\n");
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
