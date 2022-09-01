<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
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
<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;"
class="add-button" />

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>
<c:forEach var="temp" items="${cusms}" >
<c:url var="updateLink" value="/customer/showFormForUpdate">
<c:param name="customerId"  value="${temp.id}"></c:param>
</c:url>

<c:url var="deleteLink" value="/customer/delete">
<c:param name="customerId"  value="${temp.id}"></c:param>
</c:url>
<tr>
<td>${temp.firstname}</td>
<td>${temp.lastname}</td>
<td>${temp.email}</td>
<td>
<a href="${updateLink}">Update</a>
|
<a href="${deleteLink}" onClick="if (!(confirm('Are you sure you want to delete this customer?')))">Delete</a>
</td>
</c:forEach>
</table>
</div>
</div>
</body>
</html>