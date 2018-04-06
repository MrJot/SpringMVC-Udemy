<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>
<head>
	<title>Student registration form</title>
</head>


<body>

<form:form action="processForm" modelAttribute="student">
	
	
	<!-- Spring will automatically look for setter method: getFirstName -->
	First name: <form:input path="StudentFirstName"/>
	<br><br>
	<!-- Spring will automatically look for setter method: getLasttName -->
	Last name: <form:input path="StudentLastName"/>
	<br><br>
	
	<!--  Drop down list for country -->
	
	Country:
	
	<form:select path="country"> <!--  Here MVC wil call for student.setCountry() -->
	
	<form:options items="${student.countryOptions}"/><!--  This jsp code will call getter method for countryDptions variable defined in Student Class -->
<!--  		<form:option value="BRA" label="Brazil"/>
		<form:option value="FRA" label="France"/>
		<form:option value="PL" label="Poland"/>
		<form:option value="UK" label="United Kingdom"/>
		<form:option value="USA" label="United States of America"/>-->
	</form:select>
	
	<br><br>
	<form:radiobuttons path="favoriteLanguage" items="${student.listOfFavoiriteLanguages}"/>
	
	<!--  
	
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
-->
<br><br>


<!--  Selection of favorite operating system -->
	Operating systems:
	
	Linux   <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS  <form:checkbox path="operatingSystems" value="Mac OS"/>
	Windows  <form:checkbox path="operatingSystems" value="Windows"/>
	
<br><br>
<input type="submit" value="Submit"/>
	
</form:form>





</body>






</html>