package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;

public final class historyCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    \n");
      out.write("  <head>\n");
      out.write("      ");

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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"author\" content=\"Theme Region\">\n");
      out.write("   \t<meta name=\"description\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Home Serve | Services At Your Home</title>\n");
      out.write("\n");
      out.write("   <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css\\icofont.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\owl.carousel.css\">  \n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\slidr.css\">     \n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\main.css\">  \n");
      out.write("\t<link id=\"preset\" rel=\"stylesheet\" href=\"css\\presets\\preset1.css\">\t\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\responsive.css\">\n");
      out.write("\t\n");
      out.write("\t<!-- font -->\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Ubuntu:400,500,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Signika+Negative:400,300,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t<!-- icons -->\n");
      out.write("\t<link rel=\"icon\" href=\"images\\ico\\favicon.ico\">\t\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images\\ico\\apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images\\ico\\apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"57x57\" href=\"images\\ico\\apple-touch-icon-57-precomposed.png\">\n");
      out.write("    <!-- icons -->\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <!-- Template Developed By ThemeRegion -->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\t<!-- header  -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("        <!-- header -->\n");
      out.write("\n");
      out.write("\t<!-- ad-profile-page -->\n");
      out.write("        \n");
      out.write("\t<section id=\"main\" class=\"clearfix  ad-profile-page\">\n");
      out.write("            \n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileInfoCustomer.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t<!-- ad-profile -->\t\n");
      out.write("\n");
      out.write("                \t \t\t\t\n");
      out.write("\t\t</div><!-- container -->\n");
      out.write("                <div class=\"section slider\">\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!-- carousel -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-7\">\n");
      out.write("\t\t\t\t<!-- Controls -->\t\n");
 
                            
                          service_provider_dao dao=new service_provider_dao();
                          java.util.ArrayList<booking_pojo> data=dao.booking_fetch(ano);
                                
                          
                              int count=0; 
                              
                                for(booking_pojo d: data)
                                {
                                    int cid=0;
                                    customer_pojo c=new customer_pojo();
                          customer_dao daoc=new customer_dao();
                          java.util.ArrayList<customer_pojo> dc=daoc.customer_fetch(ano);
                          for(customer_pojo d1: dc)
                          { 
                              
                          
                              if(d1.getEmail().equals(ano))
                              {
                               cid=d1.getId();
                              }
                          
                          
                          }
                                
                                    booking_pojo obj=new booking_pojo();
                                    obj.setCid(d.getCid());
                                    if(cid==obj.getCid())
                                    {
                                obj.setBid(d.getBid());
                                obj.setSpid(d.getSpid());
                                obj.setService_name(d.getService_name());
                                obj.setService_id(d.getService_id());
                                obj.setBooking_time(d.getBooking_time());
                                obj.setBooking_duration(d.getBooking_duration());
                                
                                obj.setBooking_date(d.getBooking_date());
                                obj.setPrice(d.getPrice());
                                obj.setRemark(d.getRemark());
                                obj.setStatus(d.getStatus());
                                obj.setLocation(d.getLocation());
                                count++;
                                
                                
                                   
                             
                                                    
      out.write("\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t<!-- slider-text -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-5\">\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<div class=\"slider-text\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t<!-- short-info -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"short-info\">\n");
      out.write("                                                             \n");
      out.write("\t\t\t\t\t\t\t\t<h4>");
      out.print(count);
      out.write(".Service Details:  </h4>\n");
      out.write("                                                               <p><strong>Service Name: </strong><a href=\"#\">");
      out.print(obj.getService_name());
      out.write("</a> </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Charges: </strong><a href=\"#\">");
      out.print(obj.getPrice());
      out.write("</a> </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Days: </strong><a href=\"#\">");
      out.print(obj.getBooking_date());
      out.write("</a></p>\n");
      out.write("                                                                <p><strong>Time: </strong><a href=\"#\">");
      out.print(obj.getBooking_time());
      out.write("</a> </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><strong>Duration: </strong><a href=\"#\">");
      out.print(obj.getBooking_duration());
      out.write("</a></p>\n");
      out.write("                                                                <p><strong>Location: </strong><a href=\"#\">");
      out.print(obj.getLocation());
      out.write("</a></p>\n");
      out.write("                                                                 <p><strong>Status: </strong><a href=\"#\">");
      out.print(obj.getStatus());
      out.write("</a></p>\n");
      out.write("                                                                <br><br>\n");
      out.write("                                                      \n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- contact-with -->\n");
      out.write("\t\t\t\t\t\t\t<!-- contact-with -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!-- social-links -->\n");
      out.write("                                                        \n");
      out.write("                                                      \n");
      out.write("                                                        <!-- social-links -->\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t</div><!-- slider-text -->\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                            ");
}}
      out.write("\n");
      out.write("                                        </div>\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("\t</section><!-- ad-profile-page -->\n");
      out.write("\t\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t<footer id=\"footer\" class=\"clearfix\">\n");
      out.write("\t\t<!-- footer-top -->\n");
      out.write("\t\t<section class=\"footer-top clearfix\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!-- footer-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Quik Links</h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Careers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">All Cities</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Help & Support</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Advertise With Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- footer-widget -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h3>How to sell fast</h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">How to sell fast</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Membership</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Banner Advertising</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Promote your ad</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Trade Delivers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- footer-widget -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-widget social-widget\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Follow us on</h3>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i>Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter-square\"></i>Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus-square\"></i>Google+</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube-play\"></i>youtube</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- footer-widget -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-widget news-letter\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Newsletter</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Trade is Worldest leading classifieds platform that brings!</p>\n");
      out.write("\t\t\t\t\t\t\t<!-- form -->\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"Your email id\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("\t\t\t\t\t\t\t</form><!-- form -->\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- footer-widget -->\n");
      out.write("\t\t\t\t</div><!-- row -->\n");
      out.write("\t\t\t</div><!-- container -->\n");
      out.write("\t\t</section><!-- footer-top -->\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"footer-bottom clearfix text-center\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p>Copyright &copy; 2018. Developed by <a href=\"http://themeregion.com/\">ThemeRegion</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- footer-bottom -->\n");
      out.write("\t</footer><!-- footer -->\n");
      out.write("\n");
      out.write("   \t<!--/Preset Style Chooser--> \n");
      out.write("\t<div class=\"style-chooser\">\n");
      out.write("\t\t<div class=\"style-chooser-inner\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"toggler\"><i class=\"fa fa-life-ring fa-spin\"></i></a>\n");
      out.write("\t\t\t<h4>Presets</h4>\n");
      out.write("\t\t\t<ul class=\"preset-list clearfix\">\n");
      out.write("\t\t\t\t<li class=\"preset1 active\" data-preset=\"1\"><a href=\"#\" data-color=\"preset1\"></a></li>\n");
      out.write("\t\t\t\t<li class=\"preset2\" data-preset=\"2\"><a href=\"#\" data-color=\"preset2\"></a></li>\n");
      out.write("\t\t\t\t<li class=\"preset3\" data-preset=\"3\"><a href=\"#\" data-color=\"preset3\"></a></li>        \n");
      out.write("\t\t\t\t<li class=\"preset4\" data-preset=\"4\"><a href=\"#\" data-color=\"preset4\"></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--/End:Preset Style Chooser-->\n");
      out.write("\t\n");
      out.write("    <!-- JS -->\n");
      out.write("    <script src=\"js\\jquery.min.js\"></script>\n");
      out.write("    <script src=\"js\\popper.min.js\"></script>\n");
      out.write("    <script src=\"js\\modernizr.min.js\"></script>\n");
      out.write("    <script src=\"js\\bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("\t<script src=\"js\\gmaps.min.js\"></script>\n");
      out.write("    <script src=\"js\\owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js\\scrollup.min.js\"></script>\n");
      out.write("    <script src=\"js\\price-range.js\"></script> \n");
      out.write("    <script src=\"js\\jquery.countdown.js\"></script>   \n");
      out.write("    <script src=\"js\\custom.js\"></script>\n");
      out.write("\t<script src=\"js\\switcher.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("\t  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("\t  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("\t  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("\t  ga('create', 'UA-73239902-1', 'auto');\n");
      out.write("\t  ga('send', 'pageview');\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("  </body>\n");
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
