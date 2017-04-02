<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.f-body{
width:50%;
margin:250px auto;
}
</style>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="favicon.ico"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="banner-image">
<div class="banner-container">


    <div class="banner-title">
    
   
<div >
 <center><font color="red">${msg}</font></center>
    <center><h2>Delete From Email Address</h2></center>
	</br>
	<div class="portlet box">
		<div class="portlet-body form">
			
				<form name="form" action="DeleteServlet" method="post">
							<label>Email Address</label>
								<div class="input-group">
									<span class="input-group-addon">
										<i class="fa fa-envelope"></i>
									</span>
							<input type="text" class="form-control" placeholder="Email Address" name="textemail">
								</div>
								</br>
									<button type="submit" value="submit" class="btn blue">Delete</button>
									<button type="button" class="btn default">Cancel</button>
								
				</form>
		</div>
	</div>	
</div>			
</div>
</div>
</div>	
<!--footer start-->
<jsp:include page="footer.jsp"/>
<!--footer end--> 
</body>
</html>