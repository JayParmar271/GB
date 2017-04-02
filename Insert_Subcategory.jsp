<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert Subcategory</title>

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
}
</style>
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
			<div class="col-md-2">
			</div>
			<div class="col-md-8">
				<div class="border">
					<h3><center>Insert Subcategory</center></h3>
						${msg}
						 	<form name="form" action="SubcategoryServlet" method="post">
							<input type="hidden" name="pagename" value="insert_subcategory"/>
								<div class="form-group">
									<label>Subcategory Name</label>
									<input type="text" class="form-control" name="sub_cat_name" placeholder="Enter Subcategory Name">
								</div>
								<div class="form-group">
									<label>Subcategory Description</label>
									<input type="text" class="form-control" placeholder="Enter Subcategory Description" name="sub_cat_desc">
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
		
	</body>

</html>
