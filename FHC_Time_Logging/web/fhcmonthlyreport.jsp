<%-- 
    Document   : index
    Created on : Jun 1, 2018, 6:55:36 PM
    Author     : reddo
--%>

<%@page import="java.util.List"%>
<%@page import="Hibernate.Controller"%>
<%@page import="Hibernate.Patron"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FHC Monthly Report</title>
    </head>
    <body>
        <h1>Welcome to the Family History Center</h1>
        <h2>Click Submit to run the monthly report for last month's data</h2>
        <%
            out.println("<form action='fhcMonthlyReport' method='get'>");
            out.println("<input type='submit' name='button' value='Submit'>");
            out.println("</form>");                
        %>
    </body>
</html>