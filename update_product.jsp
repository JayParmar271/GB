<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${requestScope.upproductdb }" var="update"></c:set>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<title>Admin Panel</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

<style>
	.border
{
		border-style:solid;
		padding:40px;
		margin:20px;
}
</style>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
	<!-- Header Link -->
		<jsp:include page="adminpanelheader.jsp"></jsp:include>
	<!-- Header End -->
	
	<!-- Sidebar  -->
		<jsp:include page="adminpanelsidebar.jsp"></jsp:include>
	<!-- Sidebar end-->
<!--include css/bootstrap.css */ -->
			<div class="form-body">     
					<!-- BEGIN SAMPLE FORM PORTLET-->
					<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
						<div class="row">
							<div class="col-md-2">
							</div>
							<div class="col-md-8">
								<div class="border">
									<h3><center>Update Product</center></h3>
										${msg}
					
								<form name="form" action="productServlet" method="post">
									<input type="hidden" name="pagename" value="update_product"/>
								<div class="form-group">
									<label>Product Title</label>
									<input type="text" class="form-control" name="producttitle" value="${update.producttitle}" placeholder="Enter Product Title">
								</div>
								<div class="form-group">
									<label>Category</label>
									<select class="form-control" name="category" value="${update.category}">
											<option value="Select Age">Select Category</option>
											<option value="1">Insurance</option>
											<option value="2">Loan</option>
											<option value="3">Credit Card</option>
									</select>
								</div>
								<div class="form-group">
									<label>Subcategory</label>
									<select class="form-control" name="subcategory" value="${update.subcategory}">
											<option value="Select Subcategory">Select Subcategory</option>
											<option value="1">Home Insurance</option>
											<option value="2">Health Insurance</option>
											<option value="3">Life Insurance</option>
											<option value="4">Motor Insurance</option>
											<option value="5">Travel Insurance</option>
											<option value="6">Home Loan</option>
											<option value="7">Car Loan</option>
											<option value="8">Education Loan</option>
									</select>
								</div>
								<div class="form-group">
									<label>Company</label>
									<select class="form-control" name="company" value="${update.company}">
											<option value="Select Subcategory">Select Company</option>
											<option value="1">Bajaj Allianz</option>
											<option value="2">Birla Sun</option>
											<option value="3">Tata AIG</option>
											<option value="4">ICICI Prudential</option>
									</select>
								</div>
								<div class="form-group">
									<label>Start Date</label>
									<input type="date" class="form-control" name="startdate" placeholder="Enter Loan Date" value="${update.startdate}">
								</div>
								<div class="form-group">
									<label>End Date</label>
									<input type="date" class="form-control" name="enddate" placeholder="Enter Loan Date" value="${update.enddate}">
								</div>
								<div class="form-group">
									<label>Emi</label>
									<input type="text" class="form-control" placeholder="Enter Emi" name="emi" value="${update.emi}">
								</div>
								<div class="form-group">
									<label>Price</label>
									<input type="text" class="form-control" placeholder="Enter Price" name="price" value="${update.price}">
								</div>
								<div class="form-actions">
									<button type="submit" value="submit" class="btn blue">Submit</button>
									<button type="button" class="btn default">Cancel</button>
								</div>
								</form>
								
								</div>
						 </div>
						</div><!-- /.col-->
						<div class="col-md-2">
						</div>
						</div><!-- /.row  main-->
			</div>
				<!-- END SAMPLE FORM PORTLET-->	
</body>
<!-- END BODY -->
</html>