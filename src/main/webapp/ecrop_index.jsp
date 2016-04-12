<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<title>WELCOME:home</title>
</head>
<frameset  rows="40%,*,8%" >
	<frame src="header.jsp" name="head" scrolling="no">

	<frameset cols="15%,*">
		<frame noresize="noresize"  src="/views/login.jsp" name="login">
		<frame noresize="noresize" src="/views/body.jsp" name="body">
	</frameset>
	
	<frame src="/WEB_INF/views/footer.jsp" name="foot" scrolling="no">
</frameset>

</html>