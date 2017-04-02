<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<title>SignUp</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
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
<link href="assets/css/bg.css" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="favicon.ico"/>
<!-- END THEME STYLES -->
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
<jsp:include page="header.jsp"/>


    

<!--include css/bootstrap.css */ -->
<div class="form-body">   
<center><font color="red">${msg}</font></center>
<center><h1> Sign Up</h1></center>  
					<!-- BEGIN SAMPLE FORM PORTLET-->
					
						
							<form name="registerform" action="RegServlet" method="post">
							<input type="hidden" name="pagename" value="register"/>
							 		 <div class="form-group"> 
										<label>First Name</label>
										<input type="text" class="form-control" name="textfname" placeholder="Enter Your Firstname">
									 </div> 
									<div class="form-group">
										<label>Last Name</label>
										<input type="text" class="form-control" name="textlname" placeholder="Enter Your Lastname">
									</div>
									<div class="form-group">
										<label>Email Address</label>
											<input type="text" class="form-control" placeholder="Email Address" name="textemail">
									</div>
										<div class="form-group">
										<label for="exampleInputPassword1">Password</label>
											<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
									</div>
									<div class="form-group">
										<label>Select Profile</label>
										<select class="form-control" name="textpro">
											<option value="Customer">Customer</option>
											<option value="Company">Company</option>
											<option value="Bank">Bank</option>
										</select>
									</div>
										<div class="form-group">
										<label>Mobile No</label>
										<input type="text" class="form-control" name="textmo" placeholder="Enter Your Mobilenumber">
									</div>
									<div class="form-group">
										<label>Age</label>
										<select class="form-control" name="textage">
												<option value="Select Age">Select Age</option>
												<option value="5-10">5-10</option>
												<option value="10-15">10-15</option>
												<option value="15-20">15-20</option>
												<option value="20-25">20-25</option>
												<option value="25-30">25-30</option>
												<option value="30-35">30-35</option>
												<option value="35-40">35-40</option>
												<option value="40-45">40-45</option>
												<option value="45-50">45-50</option>
												<option value="50-55">50-55</option>
												<option value="55-60">55-60</option>
												<option value=">60">>60</option>
										</select>
									</div>
								    	<div class="form-group">
										<label>Gender</label>
										<div class="radio-list">
											<label>
											<input type="radio" name="rogender" id="optionsRadios1" value="male" checked>Male</label>
											<label>
											<input type="radio" name="rogender" id="optionsRadios2" value="female">Female</label>

										</div>
									</div>
									<div class="form-group">
										<label>Address</label>
										<textarea class="form-control" rows="3" name="text_area"></textarea>
									</div>
									<div class="form-group">
										<label>State</label>
										<select class="form-control" name="textstate">
												<option value="Select">Select State</option>
												<option value="Andhra Pradesh">Andhra Pradesh</option>
												<option value="Arunachal Pradesh">Arunachal Pradesh</option>
												<option value="Assam">Assam</option>
												<option value="Bihar">Bihar</option>
												<option value="Chhattisgarh">Chhattisgarh</option>
												<option value="Goa">Goa</option>
												<option value="Gujarat">Gujarat</option>
												<option value="Haryana">Haryana</option>
												<option value="Himachal Pradesh">Himachal Pradesh</option>
												<option value="Jammu and Kashmir">Jammu and Kashmir</option>
										</select>
									</div>
									
								
									<button type="submit" value="submit" class="btn btn-primary">Submit</button>
									<button type="button" class="btn btn-primary">Cancel</button>
								
							</form>
						
					
					<!-- END SAMPLE FORM PORTLET-->	
</div>
<!--footer start-->
<jsp:include page="footer.jsp"/>
<!--footer end--> 
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.3.min.js"></script>     
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/validation.js"></script>	
</body>
<!-- END BODY -->
</html>