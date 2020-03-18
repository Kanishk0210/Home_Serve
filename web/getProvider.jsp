
<%@page import="Test.service_provider_dao"%>
<%@page import="com.oreilly.servlet.MultipartRequest,java.util.*"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        MultipartRequest m=new MultipartRequest(request, "C://Users/HP/Documents/NetBeansProjects/Services/web/service_pro_photo");
        String name=m.getParameter("name");
        String email=m.getParameter("email");
        
        String password=m.getParameter("password");
        String address=m.getParameter("address");
        
        String phone=m.getParameter("mobile");
        String shopName=m.getParameter("shopName");
        String adharNumber=m.getParameter("adharNumber");
        String idProof=m.getParameter("idProof");
        String gst=m.getParameter("gst");
        String photo=m.getFilesystemName("photo").toString();
        String cdate=java.util.Calendar.getInstance().getTime().toString();
        service_provider_dao obj=new service_provider_dao();
      int n=  obj.service_provider_reg(cdate, name, password, address, adharNumber, idProof, gst, shopName, email, photo, phone);
        if (n>0) {
               out.println("<script type='text/javascript'>alert('Regstraion Success');window.location.href='login.jsp';</script>"); 
            }
        else
        {
               out.println("<script type='text/javascript'>alert('Registraion Failed');window.location.href='providerreg.jsp';</script>"); 
            
        }
        %>
    </body>
</html>
