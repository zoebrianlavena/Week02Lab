<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Servlet</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            Enter your age: <input type="text" name="ageinput" value="${agevalue}"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
            
        <div>
            <br>${message}<br>
            <a href="arithmetic">Arithmetic Calculator</a>
        </div>
        
    </body>
</html>
