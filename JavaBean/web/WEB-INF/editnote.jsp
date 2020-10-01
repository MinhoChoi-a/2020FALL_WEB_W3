<%-- 
    Document   : editnote.jsp
    Created on : 30-Sep-2020, 4:55:43 PM
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
        <h2>Edit Note</h2>
        
        <form method="post" action="note">
            Title: <input type="text" name="inputTitle" value="${title}"/><br>
            Contents: <textarea type="textarea" name="inputContent" rows="5">${content}</textarea>
            <br>
            <button type="submit">Save</button></form>
    </body>
</html>
