package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;
import java.sql.*;

public final class profileInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendRedirect("login.jsp");
            
        }
    }
    catch(Exception e)
    {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("<div class=\"breadcrumb-section\">\n");
      out.write("\t\t\t\t<!-- breadcrumb -->\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li>Ad Post</li>\n");
      out.write("\t\t\t\t</ol><!-- breadcrumb -->\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<h2 class=\"title\">My Profile</h2>\n");
      out.write("\t\t\t</div><!-- banner -->\n");
      out.write("\t\t\t");

                            service_provider_dao dao=new service_provider_dao();
                            java.util.ArrayList<service_provider_pojo> data=dao.service_pro_profile(ano);
                        service_provider_pojo obj=new service_provider_pojo();
                        for (service_provider_pojo d:data) {
                                obj.setName(d.getName());
                        obj.setEmail(d.getEmail());
                        obj.setPhoto(d.getPhoto());
                        }
                        
                        
      out.write("\n");
      out.write("\t\t\t<div class=\"ad-profile section\">\t\n");
      out.write("\t\t\t\t<div class=\"user-profile\">\n");
      out.write("\t\t\t\t\t<div class=\"user-images\">\n");
      out.write("                                            <img src=\"service_pro_photo/");
      out.print(obj.getPhoto());
      out.write("\" height=\"50px\" width=\"50px\" alt=\"User Images\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"user\">\n");
      out.write("                                            <h2>Hello, <a href=\"#\">");
      out.print(obj.getName());
      out.write("</a></h2>\n");
      out.write("\t\t\t\t\t\t<h5>You last logged in at: 14-01-2018 6:40 AM [ USA time (GMT + 6:00hrs)]</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"favorites-user\">\n");
      out.write("\t\t\t\t\t\t<div class=\"my-ads\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"addService.jsp\">23<small>My Services</small></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"favorites\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">18<small>Favorites</small></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div><!-- user-profile -->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<ul class=\"user-menu\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"my-profile.html\">Profile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"my-ads.html\">My ads</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"favourite-ads.html\">Favourite ads</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"archived-ads.html\">Archived ads </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"pending-ads.html\">Pending approval</a></li>\n");
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
