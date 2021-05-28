<!DOCTYPE html>
<html>
    <head>
        <title>Guess</title>
        <%@ include file = "partials/head.jsp" %>
    </head>
    <body>
        <form action="http://localhost:8080/adlister-1.0-SNAPSHOT/guess" method="POST">
            <label for="guess">Guess a number between 1 and 3</label>
            <input id="guess" name="guess" type="number" min="1" max="3">
            <button id="submit" formmethod="post" type="submit">Submit</button>
        </form>
    </body> 
</html>