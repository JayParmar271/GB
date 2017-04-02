<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${requestScope.upsubcategorydb }" var="update"></c:set>
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
					
							<form name="form" action="SubcategoryServlet" method="post">
							<input type="hidden" name="pagename" value="update_subcategory"/>
								<div class="form-group">
									<label>Subcategory Name</label>
									<input type="text" class="form-control" name="sub_cat_name" value="${update.subCat_name}"placeholder="Enter Subcategory Name">
								</div>
								<div class="form-group">
									<label>Subcategory Description</label>
									<input type="text" class="form-control" value="${update.subCat_desc}" placeholder="Enter Subcategory Description" name="sub_cat_desc">
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