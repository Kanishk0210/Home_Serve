package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;
import java.sql.*;

public final class addService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"getService.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"ads-info\" >\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t\t<div class=\"my-ads section\">\n");
      out.write("\t\t\t\t\t\t\t<h2>My Services</h2>\n");
      out.write("\t\t\t\t\t\t\t<!-- ad-item -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Category</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown category-dropdown\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("                                                        <select name=\"category\">\n");
      out.write("\t\t\t\t\t\t\t");

                                                                    service_provider_dao dao=new service_provider_dao();
                                                                    
                                                                    java.util.ArrayList<category_pojo> data=dao.category_fetch();
                                                                     for(category_pojo d :data)
                                                                     { 
                                                                     
                                                            
      out.write("\n");
      out.write("                                                           \n");
      out.write("                                                            <option>\n");
      out.write("                                                                ");
      out.print( d.getCategory());
      out.write("\n");
      out.write("                                                            </option>\n");
      out.write("                                                            \n");
      out.write("                                                            ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                       \t</select>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Service Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"serviceName\" placeholder=\"Service Name\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Service Description</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"serviceDescription\" placeholder=\"Service Description\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Service Charges</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" name=\"serviceCharges\" placeholder=\"Service Charges\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Available Days</label>\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" name=\"availableDate\" placeholder=\"Available Days\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Available Days</label>\n");
      out.write("                                                                        <select multiple=\"\" class=\"form-control\" name=\"txtdays\">\n");
      out.write("                                                                            <option>Monday</option>\n");
      out.write("                                                                            <option>Tuesday</option>\n");
      out.write("                                                                            <option>Wednesday</option>\n");
      out.write("                                                                            <option>Thursday</option>\n");
      out.write("                                                                            <option>Friday</option>\n");
      out.write("                                                                            <option>Saturday</option>\n");
      out.write("                                                                            <option>Sunday</option>\n");
      out.write("                                                                        </select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Available Starting Time</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"time\" class=\"form-control\" name=\"availableStartingTime\" placeholder=\"Available Starting Time\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Available Ending Time</label>\n");
      out.write("                                                                        <input type=\"time\" class=\"form-control\" name=\"availableEndingTime\" placeholder=\"Available Ending Time\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Service Duration</label>\n");
      out.write("                                                                        <select class=\"form-control\" name=\"duration\">\n");
      out.write("                                                                            <option>30 Min</option>\n");
      out.write("                                                                            <option>1 hr</option>\n");
      out.write("                                                                            <option>1 hr 30 Min</option>\n");
      out.write("                                                                            <option>2 hr</option>\n");
      out.write("                                                                        </select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Location</label>\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" name=\"location\" placeholder=\"Location\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name-three\">Photo</label>\n");
      out.write("                                                                        <input type=\"file\" class=\"form-control\" name=\"photo\" placeholder=\"Photo\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <!-- ad-item -->\n");
      out.write("\n");
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
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add Service</button>\n");
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
