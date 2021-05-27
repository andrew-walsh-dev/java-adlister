<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form action="http://localhost:8080/adlister-1.0-SNAPSHOT/login" method="post">
        <label for="email">Email</label>
        <input id="email" type="text" name="email" required>
        <label for="password">Password</label>
        <input id="password" type="text" name="password" required>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
