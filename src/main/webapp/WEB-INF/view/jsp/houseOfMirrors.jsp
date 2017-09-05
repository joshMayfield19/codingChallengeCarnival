<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
	<head>
		<title>House Of Mirrors</title>
	</head>
	<body>
		<form method="POST" action="${pageContext.request.contextPath}/uploadMaze" enctype="multipart/form-data">
		File to upload: <input type="file" name="file"><br/>
		<input type="submit" value="Upload"> Upload
		</form>
	</body>
</html>