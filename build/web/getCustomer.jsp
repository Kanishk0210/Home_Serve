<%-- 
    Document   : getCustomer
    Created on : Jul 12, 2019, 12:44:52 PM
    Author     : HP
--%>

<%@page import="Test.customer_pojo"%>
<%@page import="Test.customer_dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       customer_dao dao=new customer_dao();
       
       String name=request.getParameter("name");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       int mobile=Integer.parseInt(request.getParameter("mobile"));
       String address=request.getParameter("address");
       
       int i=dao.customer_reg(name, password, email, mobile, address);
       if (i>0) {
               out.println("<script type='text/javascript'>alert('Regstraion Success');window.location.href='customerLogin.jsp';</script>"); 
            }
        else
        {
               out.println("<script type='text/javascript'>alert('Registraion Failed');window.location.href='customerReg.jsp';</script>"); 
            
        }
       %>
    </body>
</html>
