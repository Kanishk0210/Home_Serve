


<%@page import="Test.*,java.sql.*"%>
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
	<!-- header  -->
       <header id="header" class="clearfix">
		<!-- navbar -->
		<nav class="navbar navbar-default navbar-expand-lg">
			<div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#tr-mainmenu" aria-controls="tr-mainmenu" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-align-justify"></i></span>
                </button>
				<a class="navbar-brand" href="index.jsp"><img class="img-fluid" src="images\logo.png" alt="Logo"></a>

				<div class="collapse navbar-collapse" id="tr-mainmenu">
					<ul class="nav navbar-nav">
						<li><a href="addminProfile.jsp">Home</a></li>
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
					<!-- sign-in -->					

					<a href="signout.jsp" class="btn">Sign Out</a>					
				</div>

			</div><!-- container -->
		</nav><!-- navbar -->
	</header><!-- header -->

        <!-- header -->

	<!-- ad-profile-page -->
        
	<section id="main" class="clearfix  ad-profile-page">
            
		<div class="container">
                


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<div class="breadcrumb-section">
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li><a href="addminProfile.jsp">Home</a></li>
					
				</ol><!-- breadcrumb -->						
				<h2 class="title">My Profile</h2>
			</div><!-- banner -->
                	<%
                        admin_dao dao=new admin_dao();
                        java.util.ArrayList<admin_pojo> data=dao.admin_fetch(ano);
                        
                        for(admin_pojo d: data)
                        {
                        admin_pojo obj=new admin_pojo();
                        obj.setEmail(d.getEmail());
                        obj.setId(d.getId());
                        obj.setName(d.getName());
                        
                        
                        %>		
			
			
			<div class="ad-profile section">	
				<div class="user-profile">
					
					<div class="user">
                                            <h2>Hello, <%=obj.getName()%></h2>
                                            <h4> <%=obj.getEmail()%></h4>
                                            <h4> </h4>
                                            <h4> </h4>
                                            
                                        </div>
                                        <%}%>
					<div class="favorites-user">
						
					</div>								
				</div><!-- user-profile -->
                               
						
				<ul class="user-menu">
					
					<li class="active"><a href="addCategory.jsp">Add Category</a></li>
					
					<li><a href="serviceProviders.jsp">Services </a></li>
					
                                        <li ><a href="bookings.jsp">Bookings</a></li>
					<li><a href="delete-account.html">Close account</a></li>
				</ul>
			</div>
   <form action="getCategory.jsp" method="post" >
			
			<div class="ads-info" >
				<div class="row">
					<div class="col-md-8">
						<div class="my-ads section">
							<h2>Add Category</h2>
							<!-- ad-item -->
							

								<div class="form-group">
									<label>Category Name</label>
									<input type="text" class="form-control" name="categoryName" placeholder="Category Name">
								</div>

								<div class="form-group">
									<label for="name-three">Category Description</label>
									<input type="text" class="form-control" name="categoryDescription" placeholder="Category Description">
								</div>
                                                                
                                                                
							<!-- ad-item -->
							<!-- ad-item -->
						</div>
					</div><!-- my-ads -->
                                       

					<!-- recommended-cta-->
					<!-- recommended-cta-->				
					
				</div><!-- row -->
			</div><!-- row -->
                         
                        <button type="submit" class="btn btn-primary">Add Category</button>

                        </form>


			<!-- ad-profile -->	

                	 			
		</div><!-- container -->
	</section><!-- ad-profile-page -->
	
	<!-- footer -->
	<footer id="footer" class="clearfix">
		<!-- footer-top -->
		<section class="footer-top clearfix">
			<div class="container">
				<div class="row">
					<!-- footer-widget -->
					<div class="col-sm-3">
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
					<div class="col-sm-3">
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
					<div class="col-sm-3">
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
					<div class="col-sm-3">
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