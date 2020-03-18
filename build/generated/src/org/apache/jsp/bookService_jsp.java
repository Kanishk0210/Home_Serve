package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;
import java.util.*;

public final class bookService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         ");

             int count=0;
                         service_provider_dao dao=new service_provider_dao();
                         String category=request.getParameter("category");
                         ArrayList<services_pojo> data=dao.srvice_fetch(category);
                         services_pojo obj=new services_pojo();
                         for(services_pojo d: data)
                         {
                             
                         obj.setService_name(d.getService_name());
                         obj.setService_description(d.getService_description());
                         obj.setService_charges(d.getService_charges());
                         obj.setAvailable_date(d.getAvailable_date());
                         obj.setAvailable_Stime(d.getAvailable_Stime());
                         obj.setAvailable_Etime(d.getAvailable_Etime());
                         obj.setPhoto(d.getPhoto());
                         obj.setLocation(d.getLocation());
                         obj.setService_duration(d.getService_duration());
                        count++;
                         }
                         out.println("<h1>Count : "+count+"</h1>");
                        
      out.write("\n");
      out.write("                        <form action=\"booking.jsp?category=");
      out.print(category);
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"section slider\">\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!-- carousel -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-7\">\n");
      out.write("\t\t\t\t\t\t<div id=\"product-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- item -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item carousel-item active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"carousel-image\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- image-wrapper -->\n");
      out.write("                                                                                <img src=\"images/");
      out.print(obj.getPhoto());
      out.write(".jpg\" alt=\"Featured Image\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- item -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- item --><!-- carousel-inner -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t\t\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- Controls -->\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- slider-text -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-5\">\n");
      out.write("\t\t\t\t\t\t<div class=\"slider-text\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"title\">");
      out.print(obj.getService_name());
      out.write("</h3>\n");
      out.write("\t\t\t\t\t\t\t<p><span>Description: <a href=\"#\">");
      out.print(obj.getService_description());
      out.write("</a></span>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- short-info -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"short-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service Details </h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Charges: </strong><a href=\"#\">");
      out.print(obj.getService_charges());
      out.write("</a> </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Days: </strong><a href=\"#\">");
      out.print(obj.getAvailable_date());
      out.write("</a></p>\n");
      out.write("                                                                <p><strong>Time: </strong><a href=\"#\">");
      out.print(obj.getAvailable_Stime());
      out.write(" - ");
      out.print(obj.getAvailable_Etime());
      out.write("</a> </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Duration: </strong><a href=\"#\">");
      out.print(obj.getService_duration());
      out.write("</a></p>\n");
      out.write("                                                                <p><strong>Location: </strong><a href=\"#\">");
      out.print(obj.getLocation());
      out.write("</a></p>\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t</div><!-- short-info --><input type=\"text\" name=\"name\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- contact-with -->\n");
      out.write("\t\t\t\t\t\t\t<!-- contact-with -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- social-links -->\n");
      out.write("                                                        <button type=\"submit\" class=\"form-control\" value=\"book\">Book Now</button>\n");
      out.write("\t\t\t\t\t\t\t<!-- social-links -->\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t</div><!-- slider-text -->\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\t\t\t\t\n");
      out.write("                                </div>\n");
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
