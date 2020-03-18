<%-- 
    Document   : customerLogin1
    Created on : Jul 13, 2019, 12:59:27 PM
    Author     : HP
--%>
<%@page import="Test.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        admin_dao dao1=new admin_dao();
        customer_dao dao=new customer_dao();
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        int i=0,j=0;
         j=dao1.check_login(email, password);
         i=dao.check_login(email, password);
        if(i>0)
        {
        out.println("<script type='text/javascript'>alert('Login Success');window.location.href='customerProfile.jsp';</script>");
        session.setAttribute("email", email);
        }
        else if(j>0)
        {
        out.println("<script type='text/javascript'>alert('Login Success');window.location.href='addminProfile.jsp';</script>");
        session.setAttribute("email", email);
        }
        else 
        {
        out.println("<script type='text/javascript'>alert('Login Failed:');window.location.href='customerLogin.jsp';</script>");
        }
        
        
        %>
    </body>
</html>
