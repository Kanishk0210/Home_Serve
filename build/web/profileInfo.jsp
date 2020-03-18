<%-- 
    Document   : profileInfo
    Created on : Jul 11, 2019, 10:21:44 AM
    Author     : HP
--%>
<%@page import="Test.*,java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
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
%>
<div class="breadcrumb-section">
				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					
				</ol><!-- breadcrumb -->						
				<h2 class="title">My Profile</h2>
			</div><!-- banner -->
			<%
                            service_provider_dao dao=new service_provider_dao();
                            java.util.ArrayList<service_provider_pojo> data=dao.service_pro_profile(ano);
                        service_provider_pojo obj=new service_provider_pojo();
                        for (service_provider_pojo d:data) {
                                obj.setName(d.getName());
                        obj.setEmail(d.getEmail());
                        obj.setPhoto(d.getPhoto());
                        }
                        
                        %>
			<div class="ad-profile section">	
				<div class="user-profile">
					<div class="user-images">
                                            <img src="service_pro_photo/<%=obj.getPhoto()%>" height="50px" width="50px" alt="User Images" class="img-fluid">
					</div>
					<div class="user">
                                            <h2>Hello, <%=obj.getName()%></h2>
						
					</div>

					<div class="favorites-user">
						<div class="my-ads">
							<a href="#">23<small>My Services</small></a>
						</div>
						<div class="favorites">
							<a href="#">18<small>Favorites</small></a>
						</div>
					</div>								
				</div><!-- user-profile -->
						
				<ul class="user-menu">
					
					<li class="active"><a href="serviceProviderProfile.jsp">Add Services</a></li>
					<li><a href="serviceRequest.jsp">Requested Services </a></li>
                                        <li><a href="history.jsp">History</a></li>
                                        <li><a href="approvedServices.jsp">Approved Services </a></li>
					<li><a href="pending-ads.html">Pending Services</a></li>
                                        <li ><a href="#">Update Profile</a></li>
					<li><a href="delete-account.html">Close account</a></li>
				</ul>
			</div>
    </body>
</html>
