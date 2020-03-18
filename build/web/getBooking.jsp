<%-- 
    Document   : getBooking
    Created on : Jul 13, 2019, 12:28:42 PM
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
        service_provider_dao dao=new service_provider_dao();
        
        int cid=Integer.parseInt(request.getParameter("cid"));
        int spid=Integer.parseInt(request.getParameter("spid"));
        int sid=Integer.parseInt(request.getParameter("sid"));
        String time=request.getParameter("time");
        String duration=request.getParameter("duration");
        String location=request.getParameter("location");
        String date=request.getParameter("date");
        String status=request.getParameter("status");
        int charge=Integer.parseInt(request.getParameter("charge"));
        String service_name=request.getParameter("sname");
        
        int i=dao.insert_booking(String.valueOf(cid),String.valueOf(spid),String.valueOf(sid),time,duration,date,String.valueOf(charge),"",status,location,service_name);
        if(i>0)
        {
        out.print("<script type='text/javascript'>alert('Service Requested');window.location.href='customerProfile.jsp';</script>");
        }
        else
        {
        out.print("<script type='text/javascript'>alert('Service Not Requested');window.location.href='customerProfile.jsp';</script>");
        }
        %>
    </body>
</html>
