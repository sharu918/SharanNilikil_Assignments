<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><font color="red">${errorMessage} </font></p>

<form action="/login" method="post">
Enter ur principal <input type="text" name="principal"/>Enter ur rate <input type="text" name="rate"/> 
Enter ur time <input type="text" name="time"/>
<input type="submit" value="Login" />
</form>

</body>
</html>