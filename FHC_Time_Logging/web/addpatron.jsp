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
        <form action ="addPatron" method="get">
            First Name: <input type="text" name="firstName" required> <br><br>
            Last Name: <input type="text" name="lastName" required> <br><br>
            Member?: <select name="isMember">
                    <option type='boolean' value='true'>Yes</option>
                    <option type='boolean' value='false'>No</option>
                </select>
            <br><br>
            <input type="submit" name="button" value="Submit">
        </form>
    </body>
</html>