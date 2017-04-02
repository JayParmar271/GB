<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.allsubcategorydata }" var="result"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Panel</title>

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
			<jsp:include page="adminpanelheader.jsp"></jsp:include>
		<!-- Header End -->
	
		<!-- Sidebar  -->
			<jsp:include page="adminpanelsidebar.jsp"></jsp:include>
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
					<div class="panel-heading">Subcategory</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						       <th data-field="state" data-checkbox="true" >Subcategory ID</th>
						       <th data-field="id" data-sortable="true">Subcategory ID</th>
						        <th data-field="name"  data-sortable="true">Subcategory Name</th>
						        <th data-field="description" data-sortable="true">Subcategory Description</th>
								<th data-field="update" data-sortable="true">Update</th>
						        <th data-field="delete" data-sortable="true">Delete</th>
						    </tr>
						    </thead>
						    
						    <c:forEach items="${result }" var="rows">
								<tr>
									<td>${rows.subCat_id }</td>
									<td>${rows.subCat_id }</td>
									<td>${rows.subCat_name }</td>
									<td>${rows.subCat_desc }</td>
									
									<td><a href="SubcategoryUpdate?sub_id=${rows.subCat_id }">Update</a></td>
									<td><a href="SubcategoryDelete?sub_id=${rows.subCat_id }">Delete</a></td>
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
