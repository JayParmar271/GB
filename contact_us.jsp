<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Contact :: Guidance Boutique</title>
    <link href="include/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lato:400,300,700,900' rel='stylesheet' type='text/css'>
    <link href="include/css/ionicons.min.css" rel="stylesheet" type="text/css">
    <link href="include/css/animsition.min.css" rel="stylesheet" type="text/css">
    <link href="include/css/slick.css" rel="stylesheet" type="text/css">
    <link href="include/css/slick-theme.css" rel="stylesheet" type="text/css">
    <link href="include/css/style.css" rel="stylesheet" type="text/css">
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>
  <body class="home">
<!-- LOADER  -->
<div id="loading">
    <div id="loading-center">
        <div id="loading-center-absolute">
            <div class="object" id="object_one"></div>
            <div class="object" id="object_two"></div>
            <div class="object" id="object_three"></div>
        </div>
    </div>
</div>
<div class="animsition">
<!--header start-->
  <header>
    <jsp:include page="header.jsp"/> 
  </header>
  <!--header end-->
  <!--banner-container start-->
    <div class="inner-banner-container" style="background-image:url(include/images/banner6.jpg)">
  		<div class="banner-title">
        	<h1>Contact us</h1>
            <h2>Proin ornare sem sed quam</h2>
        </div>
  </div>
  <!--banner-container end-->
  
  
  <!-- inner container start -->
  <div class="inner-container" >
 		<div class="container">
        	<div class="row">
            	<div class="col-md-6 col-sm-6">
                        <h4>Send us a Message</h4>
                        <p>If you have any query then let us know by sending message.</p>
                        
                        <form>
                        	<div class="form-group">
                            	<label>Name*</label>
                                <input type="text" value="" class="form-control" required />
                            </div>
                            <div class="form-group">
                            	<label>Email*</label>
                                <input type="email" value="" class="form-control" required/>
                            </div>
                            <div class="form-group">
                            	<label>Subject</label>
                                <input type="text" value="" class="form-control" />
                            </div>
                            <div class="form-group">
                            	<label>Message*</label>
                                <textarea class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                            	<input type="submit" value="Send Message" class="btn btn-primary" />
                            </div>
                        </form>

                </div>
                
                <div class="col-md-4 col-md-offset-1 col-sm-6 col-sm-offset-0">
                	<div class="contact-details">
                        <h4>Get in Touch</h4>
                        <p>We are happy to help you.</p>
                        
                        <h5><i class="ion ion-ios-location-outline"></i> ADDRESS</h5>
                        <p>S.g. Highway,Ahmedabad<br/>Gujarat India</p>
                        
                        <h5><i class="ion ion-ios-email-outline"></i> EMAIL</h5>
                        <p><a href="mailto:contact@guidanceboutiue.com">contact@guidanceboutiue.com</a></p>
                        
                        <h5><i class="ion ion-ios-telephone-outline"></i> PHONE</h5>
                        <p><a href="tel:1234567890">+91 - 123 456 7890</a></p>

                </div>
                </div>
               
               
                
                
            </div>
        </div>
  </div>
  <!-- inner container end -->
    
  <!-- map container start -->
  <div class="map-container">
  	<div id="map-canvas"></div>
  </div>
  <!-- map container end --> 
<!--footer start-->
  <footer>
  	 <jsp:include page="footer.jsp"/>
  </footer>
  <!--footer end-->
	</div>
	<script type="text/javascript" src="include/js/jquery.min.js"></script>
    <script type="text/javascript" src="include/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="include/js/animsition.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
    <script type="text/javascript" src="include/js/slick.js"></script>  
    <script type="text/javascript" src="include/js/jquery.countTo.js"></script>  
    <script type="text/javascript" src="include/js/scroll.js"></script> 
    <script type="text/javascript" src="include/js/imagesloaded.js"></script>
    <script type="text/javascript" src="include/js/masonry-3.1.4.js"></script>
    <script type="text/javascript" src="include/js/masonry.filter.js"></script> 
    <script type="text/javascript" src="include/js/jquery.vide.js"></script>
    <script type="text/javascript" src="include/js/custom.js"></script> 

  </body>

</html>