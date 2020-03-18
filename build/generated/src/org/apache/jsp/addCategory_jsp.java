package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;
import java.sql.*;

public final class addCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    ");
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
      out.write("        <header id=\"header\" class=\"clearfix\">\n");
      out.write("\t\t<!-- navbar -->\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-expand-lg\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#tr-mainmenu\" aria-controls=\"tr-mainmenu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"><i class=\"fa fa-align-justify\"></i></span>\n");
      out.write("                </button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><img class=\"img-fluid\" src=\"images\\logo.png\" alt=\"Logo\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"tr-mainmenu\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"customerProfile.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"categories.html\">Category</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"details.html\">Service Details</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"faq.html\">Help</a></li> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"about-us.html\">ABout Us</a></li>\n");
      out.write("                                                <li><a href=\"contact-us.html\">Contact Us</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"nav-right\">\n");
      out.write("\t\t\t\t\t<!-- language-dropdown -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- sign-in -->\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- sign-in -->\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"signout.jsp\" class=\"btn\">Sign Out</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- container -->\n");
      out.write("\t\t</nav><!-- navbar -->\n");
      out.write("\t</header>\n");
      out.write("        <form action=\"getCategory.jsp\" method=\"post\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"ads-info\" >\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"my-ads section\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Add Category</h2>\n");
      out.write("\t\t\t\t\t\t\t<!-- ad-item -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Category Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryName\" placeholder=\"Service Name\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Category Description</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryDescription\" placeholder=\"Service Description\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t<!-- ad-item -->\n");
      out.write("\t\t\t\t\t\t\t<!-- ad-item -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- my-ads -->\n");
      out.write("                                       \n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- recommended-cta-->\n");
      out.write("\t\t\t\t\t<!-- recommended-cta-->\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div><!-- row -->\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("                         \n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add Category</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
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
