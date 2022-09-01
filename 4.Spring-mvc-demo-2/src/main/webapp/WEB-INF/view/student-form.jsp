<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstname" />
<br><br>

Last Name:<form:input path="lastname"/>

<br><br>
Country:
<form:select path="country">
<form:options items="${student.co}" />
</form:select>
<br>
<br>
Operating Systems:

Linux <form:checkbox path="os" value="Linux"/> 
Mac Os <form:checkbox path="os" value="Mac Os"/>
MS Windows <form:checkbox path="os" value="MS Windows"/>
<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>