<%@page import="Test.*"%>
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
        response.sendRedirect("customerLogin.jsp");
            
        }
    }
    catch(Exception e)
    {
        response.sendRedirect("customerLogin.jsp");
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
                            customer_dao dao=new customer_dao();
                            java.util.ArrayList<customer_pojo> data=dao.customer_fetch(ano);
                        customer_pojo obj=new customer_pojo();
                        for (customer_pojo d:data) {
                                obj.setId(d.getId());
                                obj.setName(d.getName());
                                obj.setEmail(d.getEmail());
                                obj.setNumber(d.getNumber());
                                obj.setAddress(d.getAddress());
                                obj.setLocation(d.getLocation());
                        }
                        
                        %>
			<div class="ad-profile section">	
				<div class="user-profile">
					
					<div class="user">
                                            <h2>Hello, <%=obj.getName()%></h2>
                                            <h4> <%=obj.getEmail()%></h4>
                                            <h4> <%=obj.getNumber()%></h4>
                                            <h4> <%=obj.getAddress()%></h4>
                                            
                                        </div>

					<div class="favorites-user">
						<div class="my-ads">
							<a href="#">23<small>My Bookings</small></a>
						</div>
						<div class="favorites">
							<a href="#">18<small>Favorites</small></a>
						</div>
					</div>								
				</div><!-- user-profile -->
                               
						
				<ul class="user-menu">
					
					<li class="active"><a href="serviceDetails.jsp">Book Service</a></li>
					<li><a href="historyCustomer.jsp">History</a></li>
					<li><a href="serviceStatus.jsp">Service Status </a></li>
					<li><a href="delete-account.html">Close account</a></li>
				</ul>
			</div>
    </body>
</html>
