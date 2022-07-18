<%-- 
    Document   : rerister
    Created on : 14 July 2022, 2:10:29 am
    Author     : Admin
--%>

<%@ page isELIgnored="false"%>
<html>
<head>
<title>Register</title>
</head>
<body>
	<h3>Register</h3>

	<form action="register" method="post">
		<pre>
	    <strong>Register Here | <a href="login.html">Click here to Login</a></strong>
		
		User Id: <input type="text" name="userId" />
		
		Password: <input type="password" name="password" />
	
		<input type="submit" value="Register" />
	</pre>
	</form>

	${msg}
</body>
</html>