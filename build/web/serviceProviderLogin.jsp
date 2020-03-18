<%-- 
    Document   : serviceProviderLogin
    Created on : Jul 10, 2019, 11:14:27 AM
    Author     : HP
--%>
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
       String email=request.getParameter("email");
       String password=request.getParameter("password");
      
       service_provider_dao obj=new service_provider_dao();
       
       int i=obj.check_login(email, password);
       if (i>0) {
               out.println("<script type='text/javascript'>alert('Login Success');window.location.href='serviceProviderProfile.jsp';</script>"); 
       session.setAttribute("email", email);
       
       }
        else
        {
               out.println("<script type='text/javascript'>alert('Login Failed');window.location.href='login.jsp';</script>"); 
            
        }
       
       %>
    </body>
</html>
