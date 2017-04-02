<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.alldata }" var="result"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	function verificationStatus(value){
		var id = value;
		alert(id);
		window.location.href="VerifyRegServlet?verid="+id;
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
					<div class="panel-heading"><a href="Insert_Product.jsp">Insert Product</a></div>
					<div class="panel-heading">Products</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						    	<th data-field="name" data-checkbox="true" >Name</th>
						       <th data-field="dob" data-sortable="true">Date of Birth</th>
						       <th data-field="photo" data-sortable="true">Photo</th>
						        <th data-field="photoid"  data-sortable="true">Selected Photo id</th>
						        <th data-field="photoidproof" data-sortable="true">photo id proof</th>
						        <th data-field="selectedaddress" data-sortable="true">Selected Address</th>
						        <th data-field="addressproof" data-sortable="true">Address Proof</th>
						        <th data-field="address" data-sortable="true">Address</th>
						        <th data-field="status" data-sortable="true">Status</th>
						        <th data-field="delete" data-sortable="true">Delete</th>
						    </tr>
						    </thead>
	
							<c:forEach items="${result }" var="rows">
							<tr>
								
								<td>${rows.v_name }</td>
								<td>${rows.v_dob }</td>
								<td><a href="retrive_image.jsp?v_id=${rows.v_id }">ViewImage</a></td>
								<td>${rows.v_photo_id_name }</td>
								<td><a href="retrive_photoid.jsp?v_id=${rows.v_id }">ViewPhotoId</a></td>
								<td>${rows.v_photo_add_name }</td>
								<td><a href="retrive_address.jsp?v_id=${rows.v_id }">ViewPhotoId</a></td>
								<td>${rows.v_add }</td>
								<td><label class="switch">
										  <input type="checkbox" name="status" onclick="verificationStatus(${rows.v_id})">
  										 <div class="slider round"></div>
								</label></td>
								<td><a href="Verifydelete_db?v_id=${rows.v_id }">Delete</a></td>
							</tr>
							</c:forEach>

</table>

<script src="js/bootstrap-table.js"></script>

</body>
</html>