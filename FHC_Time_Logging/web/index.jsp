<%-- 
    Document   : index
    Created on : Jun 1, 2018, 6:55:36 PM
    Author     : reddo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FHC Patron Log Home Page</title>
    </head>
    <body>
        <h1>Welcome to the Family History Center</h1>
        <form action ="index" method="get">
            <select name="action">
                
                <option value="patronTimeEntry">Log Time Entry</option>
                <option value="patronTimeReport">Patron Time Report</option>
                <option value="addPatron">Add a Patron</option>
            </select>
            <input type="submit" name="button" value="Submit">
        </form>
    </body>
</html>