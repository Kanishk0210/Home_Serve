<%-- 
    Document   : getService
    Created on : Jul 10, 2019, 9:49:07 PM
    Author     : HP
--%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@page import="java.util.*,Test.*,java.sql.*" %>
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
        MultipartRequest m=new MultipartRequest(request, "C://Users/HP/Documents/NetBeansProjects/Services/web/service_pro_photo");
        service_provider_dao dao=new service_provider_dao();
        
        String category=m.getParameter("category");
        String serviceName=m.getParameter("serviceName");
        String serviceDescription=m.getParameter("serviceDescription");
        String serviceCharges=m.getParameter("serviceCharges");
        String availableDate="";//m.getParameter("availableDate");
        String availableStartingTime=m.getParameter("availableStartingTime");
        String availableEndingTime=m.getParameter("availableEndingTime");
        String serviceDuration=m.getParameter("duration");
        String location=m.getParameter("location");
        String photo=m.getFilesystemName("photo");
        String days[]=m.getParameterValues("txtdays");
        for (int i = 0; i < days.length; i++) {
        availableDate=availableDate+"+"+days[i];    
        }
        
        service_provider_pojo obj=new service_provider_pojo();
        java.util.ArrayList<service_provider_pojo> data=dao.service_pro_profile(ano);
        for(service_provider_pojo d:data)
        {
        obj.setSpid(d.getSpid());
        }
String spid=String.valueOf(obj.getSpid());
        
        int i=dao.insert_services(category,serviceName,serviceDescription,serviceCharges,availableDate,availableStartingTime,availableEndingTime,serviceDuration,location,spid,photo);
        if (i>0) {
               out.println("<script type='text/javascript'>alert('Service Added');window.location.href='serviceProviderProfile.jsp';</script>"); 
       
       
       }
        else
        {
               out.println("<script type='text/javascript'>alert('Service Not Added');window.location.href='serviceProviderProfile.jsp';</script>"); 
            
        }
        %>
    </body>
</html>
