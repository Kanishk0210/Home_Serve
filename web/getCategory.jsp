<%-- 
    Document   : getCategory
    Created on : Jul 23, 2019, 4:43:34 PM
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
        String cname=request.getParameter("categoryName");
        String cdesc=request.getParameter("categoryDescription");
        int i=0;
        admin_dao dao=new admin_dao();
        i=dao.add_categories(cname,cdesc);
        if (i>0) {
               out.println("<script type='text/javascript'>alert('Category Added');window.location.href='addminProfile.jsp';</script>"); 
            }
        else
        {
               out.println("<script type='text/javascript'>alert('Category Addition Failed');window.location.href='addminProfile.jsp';</script>"); 
            
        }
        %>
    </body>
</html>
