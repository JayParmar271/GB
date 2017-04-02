<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<title>Verify Documents</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<!--include css/bootstrap.css */ -->
<div class="form-body">   
<center><font color="red">${msg}</font></center>
<center><h1>Apply For Verification</h1></center>  
					<!-- BEGIN SAMPLE FORM PORTLET-->
					
						

 <form method="post" action="VerifyRegServlet" enctype="multipart/form-data">
<input type="hidden" name="pagename" value="verify"/>
	  <div class="form-group"> 
		<label>First Name</label>
		<input type="text" class="form-control" name="name" placeholder="Enter Your FullName">
	 </div>
	  <div class="form-group"> 
		<label>Date of Birth</label>
		<input type="date" class="form-control" name="date">
	 </div>
	  <div class="form-group"> 
		<label>Image of Yours</label>
		<input type="file" class="form-control" name="v_photo">
	 </div>	
	 <div class="form-group">
		<label>Select PhotoId Proof</label>
		<select class="form-control" name="photo_id_name">
				<option value="Select">Select Profile</option>
				<option value="VoterId">VoterID</option>
				<option value="AadharCard">AadharCard</option>
				<option value="Passport">Passport</option>
		</select>
	 </div>	
	  <div class="form-group"> 
		<label>PhotoId</label>
		<input type="file" class="form-control" name="v_photo_id">
	 </div>	
	 <div class="form-group">
		<label>Select Address Proof</label>
		<select class="form-control" name="photo_add_name">
				<option value="Select">Select Profile</option>
				<option value="VoterId">VoterID</option>
				<option value="AadharCard">AadharCard</option>
				<option value="Passport">Passport</option>
		</select>
	 </div>
	 <div class="form-group"> 
		<label>Address Proof</label>
		<input type="file" class="form-control" name="v_photo_add">
	 </div>
	 <div class="form-group">
	 	<label>Address</label>
	 	<textarea rows="3" cols="25" name="address" style="width:100%"></textarea>
	 </div>
	
	 <center>
	 <button type="submit" value="submit" class="btn btn-primary">Submit</button>
	 <button type="button" class="btn btn-primary">Cancel</button></center>

</form>
</div>
<!--footer start-->
<jsp:include page="footer.jsp"/>
<!--footer end--> 
</body>
</html>