<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>Send Details of Favourite Person</h1>
<form action="save" method="post">
<pre>
First name<input type="text" name="fname"/>
Last name<input type="text" name="lname"/>
Gender male<input type="radio" name="gender" value="male"/>
female<input type="radio" name="gender" value="female"/>
other<input type="radio" name="gender" value="others"/>
Reason<input type="textarea" name="reason"/>
Address<input type="textarea" name="address"/>
<input type="submit" value="send"/>
</pre>

</form>

</body>
</html>