<%-- 
    Document   : status
    Created on : Jul 15, 2019, 10:38:12 AM
    Author     : HP
--%>

<%@page import="Test.service_provider_dao"%>
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
        int i=0;
        
        int bid=Integer.parseInt(request.getParameter("bid"));
            
        
        String status=request.getParameter("status");
       
        if(status.equals("Accept"))
        {
        i=dao.status(bid, status);
        
        }
        else
        {
        i=dao.status(bid, status);
        
        }
        
        if(i>0)
        {
        out.print("<script type='text/javascript'>alert('Status Changed :');window.location.href='serviceProviderProfile.jsp';</script>");
        
        }
        else
        {
        out.print("<script type='text/javascript'>alert('Status Not Changed:');window.location.href='serviceProviderProfile.jsp';</script>");
        
        }
        %>
    </body>
</html>
