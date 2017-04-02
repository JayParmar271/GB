<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.allsellerproductdata }" var="result"></c:set>
<!DOCTYPE html>
<html>
<head>
<style>
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input {display:none;}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
}

input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
}
</style>
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
<script>
	function productStatus(value){
		var id = value;
		alert(id);
		window.location.href="sellerproductServlet?productid="+id;
	}
</script>
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
					<div class="panel-heading">Products</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						       <th data-field="state" data-checkbox="true" >Product ID</th>
						       <th data-field="id" data-sortable="true">Product ID</th>
						       <th data-field="status" data-sortable="true">Status</th>
						        <th data-field="title"  data-sortable="true">Product Title</th>
						        <th data-field="category" data-sortable="true">Product Category ID</th>
						        <th data-field="subcategory" data-sortable="true">Product Subcategory ID</th>
						        <th data-field="company" data-sortable="true">Product Company ID</th>
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
									<td><label class="switch">
										  <input type="checkbox" name="status" onclick="productStatus(${rows.pid})">
  										 <div class="slider round"></div>
									</label></td>
									<td>${rows.producttitle }</td>
									<td>${rows.category }</td>
									<td>${rows.subcategory }</td>
									<td>${rows.company }</td>
									<td>${rows.startdate }</td>
									<td>${rows.enddate }</td>
									<td>${rows.emi }</td>
									<td>${rows.price }</td>
									
									<td><a href="productUpdate?p_id=${rows.pid }">Update</a></td>
									<td><a href="productDelete?p_id=${rows.pid }">Delete</a></td>
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
