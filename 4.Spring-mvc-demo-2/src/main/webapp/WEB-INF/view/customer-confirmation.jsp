<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation</title>
</head>
<body>
The Customer is Confirmed: ${customer.firstname} ${customer.lastname}<br><br>
Postal Code: ${customer.postalCode}
<br><br>

</body>
</html>