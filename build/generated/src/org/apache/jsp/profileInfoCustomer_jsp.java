package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;

public final class profileInfoCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

    String ano="";
    
    try
    {
 ano=session.getAttribute("email").toString();
    if (ano.equals("")) {
        response.sendRedirect("customerLogin.jsp");
            
        }
    }
    catch(Exception e)
    {
        response.sendRedirect("customerLogin.jsp");
    }

      out.write("\n");
      out.write("<div class=\"breadcrumb-section\">\n");
      out.write("\t\t\t\t<!-- breadcrumb -->\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ol><!-- breadcrumb -->\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<h2 class=\"title\">My Profile</h2>\n");
      out.write("\t\t\t</div><!-- banner -->\n");
      out.write("\t\t\t");

                            customer_dao dao=new customer_dao();
                            java.util.ArrayList<customer_pojo> data=dao.customer_fetch(ano);
                        customer_pojo obj=new customer_pojo();
                        for (customer_pojo d:data) {
                                obj.setId(d.getId());
                                obj.setName(d.getName());
                                obj.setEmail(d.getEmail());
                                obj.setNumber(d.getNumber());
                                obj.setAddress(d.getAddress());
                                obj.setLocation(d.getLocation());
                        }
                        
                        
      out.write("\n");
      out.write("\t\t\t<div class=\"ad-profile section\">\t\n");
      out.write("\t\t\t\t<div class=\"user-profile\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"user\">\n");
      out.write("                                            <h2>Hello, ");
      out.print(obj.getName());
      out.write("</h2>\n");
      out.write("                                            <h1> ");
      out.print(obj.getEmail());
      out.write("</h1><br>\n");
      out.write("                                            <h1> ");
      out.print(obj.getNumber());
      out.write("</h1><br>\n");
      out.write("                                            <h1> ");
      out.print(obj.getAddress());
      out.write("</h1><br>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"favorites-user\">\n");
      out.write("\t\t\t\t\t\t<div class=\"my-ads\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">23<small>My Bookings</small></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"favorites\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">18<small>Favorites</small></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div><!-- user-profile -->\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bookService.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<ul class=\"user-menu\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"serviceDetails.jsp\">Book Service</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"archived-ads.html\">History</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"archived-ads.html\">Approved Services </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"pending-ads.html\">Pending Services</a></li>\n");
      out.write("                                        <li ><a href=\"#\">Update Profile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"delete-account.html\">Close account</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
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
