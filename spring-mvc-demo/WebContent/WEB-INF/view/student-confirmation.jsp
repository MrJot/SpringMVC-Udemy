<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<title>Student confirmation</title>
</head>
<body>

The student is confirmed: ${student.studentFirstName} ${student.studentLastName}
<br><br>

Country:${student.country}<!--  We are using jsp excpression language therefore here we will call student.getCountry() -->
<br><br>

Favorite language:${student.favoriteLanguage}<!--  We are using jsp excpression language therefore here we will call student.getCountry() -->
<br><br>
Operating system:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}" >
		
		<li> ${temp} </li>
		
	</c:forEach>
</ul>
<br><br>

<a href="/spring-mvc-demo">Back to Main Menu</a>
</body>
</html>