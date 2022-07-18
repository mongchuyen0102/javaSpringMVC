<%-- 
    Document   : login
    Created on : 14 July 2022, 1:26:25 am
    Author     : Admin
--%>

<%@ page isELIgnored="false"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h3>Login</h3>

	<form action="login" method="post">
		<pre>
		 <strong>Login Here | <a href="registration.html">Click here to Register</a></strong>
		
		Username: <input type="text" name="username" />
	
		Password: <input type="password" name="password" />

		<input type="submit" value="Login" />
		</pre>
	</form>
	${msg}
</body>
</html>