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
        <title>FHC Patron Time Report</title>
    </head>
    <body>
        <h1>Welcome to the Family History Center</h1>
        <h2>Select a patron for time report</h2>
        <%
            Controller controller = new Controller();
            List<Patron> patronList = controller.getPatronList();
            out.println("<form action='patronTimeReport' method='get'>");
            out.println("<select name='patronId'>");
            for (Patron patron : patronList) {
                String firstName = patron.getPatronFirstName();
                String lastName = patron.getPatronLastName();
                int patronId = patron.getPatronId();
                out.println("<option value='" + patronId + "'>" + firstName + " " + lastName + "</option>");
            }
            out.println("</select><br><br>");
            out.println("<input type='submit' name='button' value='Submit'>");
            out.println("</form>");                
        %>
    </body>
</html>