<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.alldata }" var="result"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>
<form name="myform" action="retrive.jsp" method="get">
<table>
<tr>
	<td><input type="submit" value="UserData"/></td>
</tr>

</table>


</form>
<table>
	<tr>
		<td><a href="cardataServlet">CarLoan</a>
	</tr>
	<tr>
		<td><a href="catedataServlet">Category</a>
	</tr>
	<tr>
		<td><a href="comdataServlet">Company</a></td>
	</tr>
	<tr>
		<td><a href="credataServlet">CreditCard</a></td>
	</tr>
	<tr>
		<td><a href="edudataServlet">EducationLoan</a></td>
	</tr>
	<tr>
		<td><a href="heldataServlet">HealthInsurance</a></td>
	</tr>
	<tr>
		<td><a href="homedataServlet">HomeInsurance</a></td>
	</tr>
	<tr>
		<td><a href="insudataServlet">InsuranceType</a></td>
	</tr>
	<tr>
		<td><a href="insdataSevlet">Insurance</a>
	</tr>
	<tr>
		<td><a href="lifedataServlet">LifeInsurance</a></td>
	</tr>
	<tr>
		<td><a href="loandataServlet">Loan</a></td>
	</tr>
	<tr>
		<td><a href="paydataServlet">Payment</a></td>
	</tr>
	<tr>
		<td><a href="perdataServlet">Personal Loan</a></td>
	</tr>
	<tr>
		<td><a href="tradataServlet">Travel Insurance</a></td>
	</tr>
	<tr>
		<td><a href="poldataServlet">PolicyCart</a></td>
	</tr>
	<tr>
		<td><a href="vardataServlet">Verification Status</a></td>
	</tr>
</table>
</body>
</html>