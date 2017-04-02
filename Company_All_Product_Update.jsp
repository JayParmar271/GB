<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.allproductdata }" var="result"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Company Panel</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	
		<!-- Header Link -->
			<jsp:include page="companyheader.jsp"></jsp:include>
		<!-- Header End -->
	
		<!-- Sidebar  -->
			<jsp:include page="companysidebar.jsp"></jsp:include>
		<!-- Sidebar end-->
	
			
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Hello Admin!</h1>
			</div>
		</div><!--/.row-->
				
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading"><a href="company_insert_product.jsp">Insert Product</a></div>
					<div class="panel-heading">Products</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						       <th data-field="state" data-checkbox="true" >Product ID</th>
						       <th data-field="id" data-sortable="true">Product ID</th>
						        <th data-field="title"  data-sortable="true">Product Title</th>
						        <th data-field="category" data-sortable="true">Product Category</th>
						        <th data-field="subcategory" data-sortable="true">Product Subcategory</th>
						        <th data-field="company" data-sortable="true">Product Company</th>
						        <th data-field="startdate" data-sortable="true">Product Start Date</th>
						        <th data-field="enddate" data-sortable="true">Product End Date</th>
						        <th data-field="emi" data-sortable="true">Product Emi</th>
						        <th data-field="price" data-sortable="true">Product Price</th>
						        <th data-field="update" data-sortable="true">Update</th>
						        <th data-field="delete" data-sortable="true">Delete</th>
						    </tr>
						    </thead>
						    
						    <c:forEach items="${result }" var="rows">
								<tr>
									<td>${rows.pid }</td>
									<td>${rows.pid }</td>
									<td>${rows.producttitle }</td>
									<td>${rows.category }</td>
									<td>${rows.subcategory }</td>
									<td>${rows.company }</td>
									<td>${rows.startdate }</td>
									<td>${rows.enddate }</td>
									<td>${rows.emi }</td>
									<td>${rows.price }</td>
									
									<td><a href="comproductUpdate?p_id=${rows.pid }">Update</a></td>
									<td><a href="comproductDelete?p_id=${rows.pid }">Delete</a></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
				
		
	</div><!--/.main-->


	<script src="js/bootstrap-table.js"></script>
	
</body>

</html>
