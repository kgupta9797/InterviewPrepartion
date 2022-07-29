<html>
	<head>
		<title>Welcome Page</title>
	</head>
	<body>
		<div>Welcome to Login page</div>
		<div>Your Name: ${name}</div>
		${errorMsg}
		<form method="post">
			Username:<input type="text" name ="name" >
			password:<input type=Password name="password">
			<input type="submit" value="submit">
		</form>
	</body>
</html>