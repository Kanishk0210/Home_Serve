
<!DOCTYPE html>
<%@page import="Test.*,java.util.*"%>
<html lang="en">
  <head>
      <%
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
%>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="Theme Region">
   	<meta name="description" content="">

    <title>Home Serve | Services At Your Home</title>

   <!-- CSS -->
    <link rel="stylesheet" href="css\bootstrap.min.css">
    <link rel="stylesheet" href="css\font-awesome.min.css">
	<link rel="stylesheet" href="css\icofont.css">
    <link rel="stylesheet" href="css\owl.carousel.css">  
    <link rel="stylesheet" href="css\slidr.css">     
    <link rel="stylesheet" href="css\main.css">  
	<link id="preset" rel="stylesheet" href="css\presets\preset1.css">	
    <link rel="stylesheet" href="css\responsive.css">
	
	<!-- font -->
	<link href='https://fonts.googleapis.com/css?family=Ubuntu:400,500,700,300' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Signika+Negative:400,300,600,700' rel='stylesheet' type='text/css'>

	<!-- icons -->
	<link rel="icon" href="images\ico\favicon.ico">	
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images\ico\apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images\ico\apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="57x57" href="images\ico\apple-touch-icon-57-precomposed.png">
    <!-- icons -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- Template Developed By ThemeRegion -->
  </head>
  <body>
	<!-- header -->
        <jsp:include page="header.html"></jsp:include>
        <!-- header -->

	<!-- signin-page -->
	<section id="main" class="clearfix user-page">
		<div class="container">
			<div class="row text-center">
				<!-- user-login -->			
				<div class="col-md-8 offset-md-2 col-lg-6 offset-lg-3">
					<div class="user-account">
						<h2>Booking</h2>
						<!-- form -->
                                                <form action="getBooking.jsp" method="post">
                                                    
                                                     <%
                                                       customer_dao dao1=new customer_dao();
                                                       ArrayList<customer_pojo> data1=dao1.customer_fetch(ano);
                                                       customer_pojo obj1=new customer_pojo();
                                                       for(customer_pojo d:data1)
                                                       {
                                                       obj1.setId(d.getId());
                                                       }
                         service_provider_dao dao=new service_provider_dao();
                         String category=request.getParameter("category");
                         ArrayList<services_pojo> data=dao.srvice_fetch(category);
                         services_pojo obj=new services_pojo();
                         for(services_pojo d: data)
                         {
                         obj.setService_id(d.getService_id());
                         obj.setService_pro_id(d.getService_pro_id());
                         obj.setService_name(d.getService_name());
                         obj.setService_description(d.getService_description());
                         obj.setService_charges(d.getService_charges());
                         obj.setAvailable_date(d.getAvailable_date());
                         obj.setAvailable_Stime(d.getAvailable_Stime());
                         obj.setAvailable_Etime(d.getAvailable_Etime());
                         obj.setPhoto(d.getPhoto());
                         obj.setLocation(d.getLocation());
                         obj.setService_duration(d.getService_duration());
                         }
                        %>
                        
			<div class="section slider">					
				<div class="row">
					<!-- carousel -->
					<div class="col-lg-7">
						<div id="product-carousel" class="carousel slide" data-ride="carousel">
							<!-- Indicators -->
							

							<!-- Wrapper for slides -->
							<div class="carousel-inner" role="listbox">
								<!-- item -->
								<div class="item carousel-item active">
									<div class="carousel-image">
										<!-- image-wrapper -->
                                                                                <img src="images/<%=obj.getPhoto()%>.jpg" alt="Featured Image" class="img-fluid">
									</div>
								</div><!-- item -->

								<!-- item --><!-- carousel-inner -->

							<!-- Controls -->
							<!-- Controls -->
						</div>
					</div><!-- Controls -->	

					<!-- slider-text -->
					<div class="col-lg-5">
						<div class="slider-text">
							
							<h3 class="title" ><%=obj.getService_name()%></h3>
							<p><span>Description: <a href="#"><%=obj.getService_description()%></a></span>
							
							
							<!-- short-info -->
							<div class="short-info">
								<h4>Service Details </h4>
								<p><strong>Charges: </strong><a href="#"><%=obj.getService_charges()%></a> </p>
								<p><strong>Days: </strong><a href="#"><%=obj.getAvailable_date()%></a></p>
                                                                <p><strong>Time: </strong><a href="#"><%=obj.getAvailable_Stime()%> - <%=obj.getAvailable_Etime()%></a> </p>
								<p><strong>Duration: </strong><a href="#"><%=obj.getService_duration()%></a></p>
                                                                <p><strong>Location: </strong><a href="#"><%=obj.getLocation()%></a></p>
                                                                <input type="hidden" value="<%=obj.getService_charges()%>" name="charge"/>
                                                                <input type="hidden" value="<%=obj.getAvailable_date()%>" name="date"/>
                                                        <input type="hidden" value="<%=obj.getService_duration()%>" name="duration"/>
                                                          <input type="hidden" value="<%=obj.getService_id()%>" name="sid"/>
                                                          <input type="hidden" value="<%=obj.getService_pro_id()%>" name="spid"/>
                                                          <input type="hidden" value="<%=obj1.getId()%>" name="cid"/>
                                                          <input type="hidden" value="Requested" name="status"/>
                                                          <input type="hidden" value="<%=obj.getService_name()%>" name="sname"/>
                                                        </div>
                                                        <!-- short-info -->
							
							<!-- contact-with -->
							<!-- contact-with -->
							
							<!-- social-links -->
                                                        
							<!-- social-links -->						
					
                                                </div>
					</div><!-- slider-text -->				
                                        </div>
                                        </div>				
                                </div>
                        
							<div class="form-group">
                                                            Time:
								<input type="time" class="form-control" name="time" placeholder="">
							</div>
							<div class="form-group">
                                                            Location:
								<input type="text" class="form-control" name="location" placeholder="">
							</div>
							<button type="submit" class="btn">Book</button>
						</form><!-- form -->
					
						<!-- forgot-password -->
						<!-- forgot-password -->
					</div>
					
				</div><!-- user-login -->			
			</div><!-- row -->	
		</div><!-- container -->
	</section><!-- signin-page -->
	
	<!-- footer -->
	<footer id="footer" class="clearfix">
		<!-- footer-top -->
		<section class="footer-top clearfix">
			<div class="container">
				<div class="row">
					<!-- footer-widget -->
					<div class="col-md-6 col-lg-3">
						<div class="footer-widget">
							<h3>Quik Links</h3>
							<ul>
								<li><a href="#">About Us</a></li>
								<li><a href="#">Contact Us</a></li>
								<li><a href="#">Careers</a></li>
								<li><a href="#">All Cities</a></li>
								<li><a href="#">Help & Support</a></li>
								<li><a href="#">Advertise With Us</a></li>
								<li><a href="#">Blog</a></li>
							</ul>
						</div>
					</div><!-- footer-widget -->

					<!-- footer-widget -->
					<div class="col-md-6 col-lg-3">
						<div class="footer-widget">
							<h3>How to sell fast</h3>
							<ul>
								<li><a href="#">How to sell fast</a></li>
								<li><a href="#">Membership</a></li>
								<li><a href="#">Banner Advertising</a></li>
								<li><a href="#">Promote your ad</a></li>
								<li><a href="#">Trade Delivers</a></li>
								<li><a href="#">FAQ</a></li>
							</ul>
						</div>
					</div><!-- footer-widget -->

					<!-- footer-widget -->
					<div class="col-md-6 col-lg-3">
						<div class="footer-widget social-widget">
							<h3>Follow us on</h3>
							<ul>
								<li><a href="#"><i class="fa fa-facebook-official"></i>Facebook</a></li>
								<li><a href="#"><i class="fa fa-twitter-square"></i>Twitter</a></li>
								<li><a href="#"><i class="fa fa-google-plus-square"></i>Google+</a></li>
								<li><a href="#"><i class="fa fa-youtube-play"></i>youtube</a></li>
							</ul>
						</div>
					</div><!-- footer-widget -->

					<!-- footer-widget -->
					<div class="col-md-6 col-lg-3">
						<div class="footer-widget news-letter">
							<h3>Newsletter</h3>
							<p>Trade is Worldest leading classifieds platform that brings!</p>
							<!-- form -->
							<form action="#">
								<input type="email" class="form-control" placeholder="Your email id">
								<button type="submit" class="btn btn-primary">Sign Up</button>
							</form><!-- form -->			
						</div>
					</div><!-- footer-widget -->
				</div><!-- row -->
			</div><!-- container -->
		</section><!-- footer-top -->

		
		<div class="footer-bottom clearfix text-center">
			<div class="container">
				<p>Copyright &copy; 2018. Developed by <a href="http://themeregion.com/">ThemeRegion</a></p>
			</div>
		</div><!-- footer-bottom -->
	</footer><!-- footer -->

	<!--/Preset Style Chooser--> 
	<div class="style-chooser">
		<div class="style-chooser-inner">
			<a href="#" class="toggler"><i class="fa fa-life-ring fa-spin"></i></a>
			<h4>Presets</h4>
			<ul class="preset-list clearfix">
				<li class="preset1 active" data-preset="1"><a href="#" data-color="preset1"></a></li>
				<li class="preset2" data-preset="2"><a href="#" data-color="preset2"></a></li>
				<li class="preset3" data-preset="3"><a href="#" data-color="preset3"></a></li>        
				<li class="preset4" data-preset="4"><a href="#" data-color="preset4"></a></li>
			</ul>
		</div>
	</div>
	<!--/End:Preset Style Chooser-->
	
     <!-- JS -->
    <script src="js\jquery.min.js"></script>
    <script src="js\popper.min.js"></script>
    <script src="js\modernizr.min.js"></script>
    <script src="js\bootstrap.min.js"></script>
	<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
	<script src="js\gmaps.min.js"></script>
    <script src="js\owl.carousel.min.js"></script>
    <script src="js\scrollup.min.js"></script>
    <script src="js\price-range.js"></script> 
    <script src="js\jquery.countdown.js"></script>   
    <script src="js\custom.js"></script>
	<script src="js\switcher.js"></script>
	<script>
	  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	  ga('create', 'UA-73239902-1', 'auto');
	  ga('send', 'pageview');

	</script>
  </body>
</html>