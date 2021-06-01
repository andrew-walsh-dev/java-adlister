<!DOCTYPE html>
<html>
    <head>
        <title>Color Picker</title>
        <%@ include file = "partials/head.jsp" %>
    </head>
    <body>
        <h1>Enter a color</h1>
        <form action="http://localhost:8080/adlister-1.0-SNAPSHOT/color" method="POST">
            <input type="text" name="color">
            <button type="submit">Submit</button>
        </form>
    </body> 
</html>