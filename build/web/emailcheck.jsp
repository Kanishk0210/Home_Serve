<%-- 
    Document   : emailcheck
    Created on : Jul 10, 2019, 10:13:24 PM
    Author     : HP
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
         int i=0;
         Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home_serve","root","");
        Statement stmt=con.createStatement();
        String email=request.getParameter("email").toString();
        ResultSet rs=stmt.executeQuery("SELECT * FROM service_provider where email='"+email+"'");
        
        while(rs.next()){
            i=i+1;
        }
        if(i>0)
        {out.println("Not Available");}
        else{out.println("Available");
        }
        %>
    </body>
</html>
