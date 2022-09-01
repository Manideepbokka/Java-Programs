<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
List customers - coming soon ....
<h2>Customers are god to my business</h2>
<div id="wrapper">
<div id="header">
<h2>CRM - Customer Relationship Manager</h2>
</div>
</div>
<div id="container">
<div id="content">
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<c:forEach var="temp" items="${cusms}" >
<tr>
<td>${temp.firstname}</td>
<td>${temp.lastname}</td>
<td>${temp.email}</td>
</c:forEach>
</table>
</div>
</div>
</body>
</html>