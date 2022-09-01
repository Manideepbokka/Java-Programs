<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>
Customer Registration Form
</title>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
First Name: <form:input path="firstname"/>
<br><br>
Last Name(*): <form:input path="lastname"/>
<form:errors path="lastname" cssClass="error"/>
<br><br>
Postal Code <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>