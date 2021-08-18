<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${successfulMsg }</h1>
<h1>Vaccination-RegForm</h1>
	
	<div>
		<form action="register.do">
			<pre>
<input type="text" name="userName" placeholder="name" required>
<input type="email" name="email" placeholder="email" required>
<input type="number" name="otp">
<input type="submit" value="Register">

	</pre>

		</form>
	</div>

</body>
</html>