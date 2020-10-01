<%-- 
    Document   : viewnote
    Created on : 30-Sep-2020, 4:55:29 PM
    Author     : minho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <p>Title: ${title}</p>
        <p>Contents:</p>
        <p>${content}</p>
        
        <br>
        
        <a href="note?edit">Edit</a>
        
    </body>
</html>
