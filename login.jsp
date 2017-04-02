<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<style>
.f-body{
width:50%;
margin:250px auto;
}
body{

}
</style>
<title>LogIn</title>
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
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
<jsp:include page="header.jsp"/>
<div class="banner-image">
<div class="banner-container">


    <div class="banner-title">
    
<center><font color="red">${msg}</font></center>
<center><h1> Log In</h1></center>
					<!-- BEGIN SAMPLE FORM PORTLET-->
					<div class="portlet box">
					
				
					</br>
						
							<form name="form" action="RegServlet" method="post">
							<input type="hidden" name="pagename" value="login"/>
										<label>Email Address</label>
										<div class="input-group">
											<span class="input-group-addon">
												<i class="fa fa-envelope"></i>
											</span>
											<input type="text" class="form-control" placeholder="Email Address" name="textid">
										</div>
									</br>
										<div class="form-group">
										<label for="exampleInputPassword1">Password</label>
										<div class="input-group">
											
											<span class="input-group-addon">
												<i class="fa fa-user"></i>
											</span>
											<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="textpass">
										</div>
									</div>
													
								
									<button type="submit" value="submit" class="btn btn-primary">Login</button>
									<button type="button" class="btn btn-primary">Cancel</button>
								
							</form>
						
					</div>
					<!-- END SAMPLE FORM PORTLET-->	
</div>
</div>
</div>
<!--footer start-->
<jsp:include page="footer.jsp"/>
<!--footer end--> 
</body>
<!-- END BODY -->
</html>