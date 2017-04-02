<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert Product</title>

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
		<jsp:include page="companyheader.jsp"></jsp:include>
	<!-- Header End -->
	
	<!-- Sidebar  -->
		<jsp:include page="companysidebar.jsp"></jsp:include>
	<!-- Sidebar end-->
			
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<div class="col-md-2">
			</div>
			<div class="col-md-8">
				<div class="border">
					<h3><center>Insert Product</center></h3>
						${msg}
						 	<form name="form" action="comproductServlet" method="POST">
							<input type="hidden" name="pagename" value="insert_product"/>
								<div class="form-group">
									<label>Product Title</label>
									<input type="text" class="form-control" name="producttitle" placeholder="Enter Product Title">
								</div>
								<div class="form-group">
									<label>Category</label>
									<select class="form-control" name="category">
											<option value="Select Age">Select Category</option>
											<option value="1">Insurance</option>
											<option value="2">Loan</option>
											<option value="3">Credit Card</option>
									</select>
								</div>
								<div class="form-group">
									<label>Subcategory</label>
									<select class="form-control" name="subcategory">
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
									<select class="form-control" name="company">
											<option value="Select Subcategory">Select Company</option>
											<option value="1">Bajaj Allianz</option>
											<option value="2">Birla Sun</option>
											<option value="3">Tata AIG</option>
											<option value="4">ICICI Prudential</option>
									</select>
								</div>
								<div class="form-group">
									<label>Start Date</label>
									<input type="date" class="form-control" name="startdate" placeholder="Enter Loan Date">
								</div>
								<div class="form-group">
									<label>End Date</label>
									<input type="date" class="form-control" name="enddate" placeholder="Enter Loan Date">
								</div>
								<div class="form-group">
									<label>Emi</label>
									<input type="text" class="form-control" placeholder="Enter Emi" name="emi">
								</div>
								<div class="form-group">
									<label>Price</label>
									<input type="text" class="form-control" placeholder="Enter Price" name="price">
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
