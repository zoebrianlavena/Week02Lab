<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Servlet</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${firstvalue}"><br>
            Second: <input type="text" name="second" value="${secondvalue}"><br>
            <input type="submit" value="+" name="operation">
            <input type="submit" value="-" name="operation">
            <input type="submit" value="*" name="operation">
            <input type="submit" value="%" name="operation">
        </form>
        
        <div>
            <br>${message}<br>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
