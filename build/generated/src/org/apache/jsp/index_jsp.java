package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
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
      out.write("\t<!-- header -->\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
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
      out.write("\t\t\t\t\t<ul class=\"sign-in\">\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-user\"></i></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"customerLogin.jsp\">Sign In</a></li>\n");
      out.write("                                                <li><a href=\"customerReg.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t</ul><!-- sign-in -->\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"login.jsp\" class=\"btn\">Service Provider Login</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- container -->\n");
      out.write("\t\t</nav><!-- navbar -->\n");
      out.write("\t</header><!-- header -->\n");
      out.write("\n");
      out.write("\t<!-- home-one-info -->\n");
      out.write("\t<section id=\"home-one-info\" class=\"clearfix home-one\">\n");
      out.write("\t\t<!-- world -->\n");
      out.write("\t\t<div id=\"banner-two\" class=\"parallax-section\">\n");
      out.write("\t\t\t<div class=\"row text-center\">\n");
      out.write("\t\t\t\t<!-- banner -->\n");
      out.write("\t\t\t\t<div class=\"col-sm-12 \">\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\n");
      out.write("\t\t\t\t\t\t<h1 class=\"title\">Home Serve | Services At Your Home</h1>\n");
      out.write("\t\t\t\t\t\t<h3>Search and get your services done</h3>\n");
      out.write("\t\t\t\t\t\t<!-- banner-form -->\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-form\">\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- category-change -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown category-dropdown\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"#\"><span class=\"change-text\">Select Category</span> <i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu category-change\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                                                    service_provider_dao dao=new service_provider_dao();
                                                                    category_pojo obj=new category_pojo();
                                                                    java.util.ArrayList<category_pojo> data=dao.category_fetch();
                                                                     for(category_pojo d:data)
                                                                     { 
                                                                     
                                                                     
                                                            
      out.write("\n");
      out.write("                                                            <li><a href=\"serviceDetails.jsp?category=");
      out.print(d.getCategory());
      out.write("\">\n");
      out.write("                                                                ");
      out.print( d.getCategory());
      out.write("\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- category-change -->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Type Your key word\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"form-control\" value=\"Search\">Search</button>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div><!-- banner-form -->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- banner-socail -->\n");
      out.write("\t\t\t\t\t\t<ul class=\"banner-socail\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul><!-- banner-socail -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div><!-- banner -->\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- world -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section category-ad text-center\">\n");
      out.write("                            <h2>Services</h2>\n");
      out.write("\t\t\t\t<ul class=\"category-list\">\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\1.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Cars & Vehicles</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(1298)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\2.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Electrics & Gedgets</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(76212)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\3.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Real Estate</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(212)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\4.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Sports & Games</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(972)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\5.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Fshion & Beauty</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(1298)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\6.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Pets & Animals</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(76212)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\9.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Home Appliances</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(1298)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\10.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Matrimony Services</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(76212)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\11.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Music & Arts</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(212)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\12.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Miscellaneous </span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(1298)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\7.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Job Openings </span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(124)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"category-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"categories.html\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"category-icon\"><img src=\"images\\icon\\8.png\" alt=\"images\" class=\"img-fluid\"></div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-title\">Books & Magazines</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"category-quantity\">(972)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li><!-- category-item -->\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\t\t\t\t\n");
      out.write("\t\t\t</div><!-- category-ad -->\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- featureds -->\n");
      out.write("\t\t\t<!-- featureds -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- ad-section -->\t\t\t\t\t\t\n");
      out.write("\t\t\t<!-- trending-ads -->\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- cta -->\n");
      out.write("\t\t\t<!-- home-one-info -->\n");
      out.write("\t\n");
      out.write("\t<!-- download -->\n");
      out.write("\t<!-- download -->\n");
      out.write("\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t<footer id=\"footer\" class=\"clearfix\">\n");
      out.write("\t\t<!-- footer-top -->\n");
      out.write("\t\t<section class=\"footer-top clearfix\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!-- footer-widget -->\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
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
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
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
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
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
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
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
      out.write("\t\n");
      out.write("\t<!--/Preset Style Chooser--> \n");
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
      out.write("     <!-- JS -->\n");
      out.write("    <script src=\"js\\jquery.min.js\"></script>\n");
      out.write("    <script src=\"js\\popper.min.js\"></script>\n");
      out.write("    <script src=\"js\\modernizr.min.js\"></script>\n");
      out.write("    <script src=\"js\\bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("\t<script src=\"js\\gmaps.min.js\"></script>\n");
      out.write("    <script src=\"js\\owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js\\scrollup.min.js\"></script>\n");
      out.write("    <script src=\"js\\price-range.js\"></script>  \n");
      out.write("    <script src=\"js\\jquery.countdown.js\"></script>  \n");
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
