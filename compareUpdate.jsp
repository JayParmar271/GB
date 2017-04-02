<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${requestScope.upcomparedb}" var="compare"></c:set>
<c:set value="${requestScope.upcomparedb1}" var="compare1"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="include/css/style.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.maincontent{
margin:100px 250px auto;
position:fixed;
}
</style>
<title>Retrive</title>
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
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="banner-image">

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%

String id = request.getParameter("email");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "signup_login";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!-- table start-->
      <div class="row shortcode-container">
        
         <center> <h2 class="heading">Comparison</h2></center>
        
        <div class="col-sm-12">
          <div class="table-responsive">
            <table class="table table-striped table-bordered">
              <thead>
                <tr>
                  <th>Attribute</th>
                  <th>${compare.producttitle}</th>
                  <th>${compare1.producttitle}</th>
                </tr>
              </thead>
              <tbody>
                
                


    <tr>
    	<td>Product Category Id</td>
    	<td>${compare.category }</td>
    	<td>${compare1.category}</td>
    </tr>
	<tr>
		<td>Product Subcategory Id</td>
		<td>${compare.subcategory}</td>
		<td>${compare1.subcategory}</td>
	</tr>
	<tr>
		<td>Product Company</td>
		<td>${compare.company }</td>
		<td>${compare1.company }</td>
	</tr>
	<tr>
		<td>Emi</td>
		<td>${compare.emi }</td>
		<td>${compare1.emi }</td>
	</tr>
	<tr>
		<td>Price</td>	
		<td>${compare.price }</td>
		<td>${compare1.price }</td>
	</tr>


	

	


</tbody>
            </table>
             <!-- table end-->

      </div>
      <!--footer start-->
<jsp:include page="footer.jsp"/>
<!--footer end--> 
      
</div>
</body>
</html>