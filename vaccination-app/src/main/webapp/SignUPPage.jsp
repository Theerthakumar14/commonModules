<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>SignUp for vaccination</header>
<h1>${successfulMsg }</h1>
<div>
<form action="getOtp.do">
<pre>
email:<input type="email" name="email" placeholder="Email" required>

<input type="submit" value="get OTP">

</pre>
</form>

</div>
</body>
</html>