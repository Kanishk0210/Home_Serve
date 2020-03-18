
<!DOCTYPE html>
<%@page import="Test.*,java.util.*" %>
<html lang="en">
  <head>
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
        <header id="header" class="clearfix">
		<!-- navbar -->
		<nav class="navbar navbar-default navbar-expand-lg">
			<div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#tr-mainmenu" aria-controls="tr-mainmenu" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-align-justify"></i></span>
                </button>
				<a class="navbar-brand" href="index.jsp"><img height="140px" width="140px" class="img-fluid" src="images\logo_1.png" alt="Logo"></a>

				<div class="collapse navbar-collapse" id="tr-mainmenu">
					<ul class="nav navbar-nav">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="categories.html">Category</a></li>
						<li><a href="details.html">Service Details</a></li>
						<li><a href="faq.html">Help</a></li> 
						<li><a href="about-us.html">ABout Us</a></li>
                                                <li><a href="contact-us.html">Contact Us</a></li>
                                        
					</ul>
				</div>

				<div class="nav-right">
					<!-- language-dropdown -->

					<!-- sign-in -->					
					<ul class="sign-in">
						<li><i class="fa fa-user"></i></li>
						<li><a href="customerLogin.jsp">Sign In</a></li>
                                                <li><a href="customerReg.jsp">Register</a></li>
					</ul><!-- sign-in -->					

					<a href="login.jsp" class="btn">Service Provider Login</a>					
				</div>

			</div><!-- container -->
		</nav><!-- navbar -->
	</header><!-- header -->

	<!-- home-one-info -->
	<section id="home-one-info" class="clearfix home-one">
		<!-- world -->
		<div id="banner-two" class="parallax-section">
			<div class="row text-center">
				<!-- banner -->
				<div class="col-sm-12 ">
					<div class="banner">
						<h1 class="title">Home Serve | Services At Your Home</h1>
						<h3>Search and get your services done</h3>
						<!-- banner-form -->
						<div  class="banner-form">
							
								<!-- category-change -->
								<div class="dropdown category-dropdown">						
									<a data-toggle="dropdown" href="#"><span  class="change-text">Select Category</span> <i class="fa fa-angle-down"></i></a>
									<ul class="dropdown-menu category-change">
										<%
                                                                    service_provider_dao dao=new service_provider_dao();
                                                                    category_pojo obj=new category_pojo();
                                                                    java.util.ArrayList<category_pojo> data=dao.category_fetch();
                                                                     for(category_pojo d:data)
                                                                     {                                                                     
                                                            %>
                                                            <li><a href="serviceDetails.jsp?category=<%=d.getCategory()%>">
                                                                <%= d.getCategory()%>
                                                                </a>
                                                            </li>
                                                            <%}%>
									</ul>								
								</div><!-- category-change -->
							
								
						</div><!-- banner-form -->
						
						<!-- banner-socail -->
						<ul class="banner-socail">
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#"><i class="fa fa-youtube"></i></a></li>
						</ul><!-- banner-socail -->
					</div>
				</div><!-- banner -->
			</div><!-- row -->
		</div><!-- world -->
                
                
                
		<div class="container">
			<div class="section category-ad text-center">
                            <h2>Services</h2>
				<ul class="category-list">	
                                    <%
                                    for(category_pojo d1 : data)
                                    {
                                    %>
					<li class="category-item">
						<a href="serviceDetails.jsp?category=<%=d1.getCategory()%>">
							<div class="category-icon"><img height="150px" width="170px" src="images\logo_2.png" alt="images" class="img-fluid"></div>
							<span class="category-title"><%=d1.getCategory()%></span>
							
						</a>
					</li><!-- category-item -->
                                    <%}%>
					<!-- category-item -->
					
					<!-- category-item -->					
				</ul>				
			</div><!-- category-ad -->	
		
			<!-- featureds -->
			<!-- featureds -->

			<!-- ad-section -->						
			<!-- trending-ads -->			

			<!-- cta -->
			<!-- home-one-info -->
	
	<!-- download -->
	<!-- download -->

	<!-- footer -->
	<footer id="footer" class="clearfix">
		<!-- footer-top -->
		<section class="footer-top clearfix">
			<div class="container">
				<div class="row">
					<!-- footer-widget -->
					<div class="col-md-3 col-sm-6">
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
					<div class="col-md-3 col-sm-6">
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
					<!-- footer-widget -->
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