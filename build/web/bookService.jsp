<%-- 
    Document   : bookService
    Created on : Jul 13, 2019, 9:46:26 PM
    Author     : HP
--%>
<%@page import="Test.*,java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%
             
                         service_provider_dao dao=new service_provider_dao();
                         String category=request.getParameter("category");
                         ArrayList<services_pojo> data=dao.srvice_fetch(category);
                         
                         for(services_pojo d: data)
                         {
                             services_pojo obj=new services_pojo();
                         obj.setService_name(d.getService_name());
                         obj.setService_description(d.getService_description());
                         obj.setService_charges(d.getService_charges());
                         obj.setAvailable_date(d.getAvailable_date());
                         obj.setAvailable_Stime(d.getAvailable_Stime());
                         obj.setAvailable_Etime(d.getAvailable_Etime());
                         obj.setPhoto(d.getPhoto());
                         obj.setLocation(d.getLocation());
                         obj.setService_duration(d.getService_duration());
                       
                         
                        
                        %>
                        <form action="booking.jsp?category=<%=category%>" method="post">
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
							
							<h3 class="title"><%=obj.getService_name()%></h3>
							<p><span>Description: <a href="#"><%=obj.getService_description()%></a></span>
							
							
							<!-- short-info -->
							<div class="short-info">
								<h4>Service Details </h4>
								<p><strong>Charges: </strong><a href="#"><%=obj.getService_charges()%></a> </p>
								<p><strong>Days: </strong><a href="#"><%=obj.getAvailable_date()%></a></p>
                                                                <p><strong>Time: </strong><a href="#"><%=obj.getAvailable_Stime()%> - <%=obj.getAvailable_Etime()%></a> </p>
								<p><strong>Duration: </strong><a href="#"><%=obj.getService_duration()%></a></p>
                                                                <p><strong>Location: </strong><a href="#"><%=obj.getLocation()%></a></p>
                                                                
							</div><!-- short-info --><input type="text" name="name"/>
							
							<!-- contact-with -->
							<!-- contact-with -->
							
							<!-- social-links -->
                                                        <button type="submit" class="form-control" value="book">Book Now</button>
							<!-- social-links -->						
					
                                                </div>
					</div><!-- slider-text -->				
                                        </div>
                                        </div>				
                                </div>
                        </form><%}%>
    </body>
</html>
