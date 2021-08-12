<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>enrollment-page</title>
<style type="text/css">
body {
	background-color: pink
}

h1 {
	text-align: left;
	font-family: cursive;
	color: red;
	padding: 10px;
}
div{

}

.button {
	font-size: 15px;
	background-color: green;
	color: white;
	border: 5px solid;
	padding-top: 5px;
}
</style>
</head>
<body>
	<form action="enroll.do">
		<h1>Student-enroll</h1>
		<div>
<pre>
USERNAME:<input type="text" name="userName"><br>
EMAIL:<input type="email" name="email"><br>
</pre>

		</div>
		<input type="submit" value="onEnroll" class=" button">


	</form>

</body>
</html>