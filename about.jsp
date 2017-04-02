<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>About Us :: Guidance Boutique</title>
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
    <div class="inner-banner-container" style="background-image:url(include/images/banner8.jpg)">
  		<div class="banner-title">
        	<h1>About</h1>
            <h2>We are team which build new things everyday.</h2>
        </div>
  </div>
  <!--banner-container end-->
  <!-- inner container start -->
  <div class="inner-container" >
 		<div class="container">
        	<div class="row">
            	<div class="col-md-4 col-sm-6">
                	<div class="team-box full">
                    	<figure><img src="include/images/member1.jpg" alt="" />
                        	<figcaption>
                            	<h3>PARMAR JAY</h3>
                            	<h6>MANAGING DIRECTOR</h6>
                            </figcaption>
                        </figure>
                        <div class="team-box-detail">
                        <div class="member-details">
                        	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque faucibus enim vitae arcu aliquam imperdiet. Morbi efficitur metus a neque egestas pellentesque. Proin lectus tortor, cursus non pretium eu, sagittis in felis. Nam at elit vel enim interdum tincidunt. Curabitur dapibus dui a lectus auctor, ac cursus mi efficitur.</p>
                            <p><a href="#" target="_blank"><i class="ion ion-social-facebook"></i></a><a href="#" target="_blank"><i class="ion ion-social-twitter"></i></a><a href="#" target="_blank"><i class="ion ion-social-instagram"></i></a></p>
                        </div>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-4 col-sm-6">
                	<div class="team-box full">
                        <figure><img src="include/images/member2.jpg" alt="" />
                        	<figcaption>
                            	<h3>PRITESH VADHIYA</h3>
                                <h6>SEO MANAGER</h6>
                            </figcaption>
                        </figure>
                        <div class="team-box-detail">
                        <div class="member-details">
                        	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque faucibus enim vitae arcu aliquam imperdiet. Morbi efficitur metus a neque egestas pellentesque. Proin lectus tortor, cursus non pretium eu, sagittis in felis. Nam at elit vel enim interdum tincidunt. Curabitur dapibus dui a lectus auctor, ac cursus mi efficitur.</p>
                            <p><a href="#" target="_blank"><i class="ion ion-social-facebook"></i></a><a href="#" target="_blank"><i class="ion ion-social-twitter"></i></a><a href="#" target="_blank"><i class="ion ion-social-instagram"></i></a></p>
                        </div>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-4 col-sm-6">
                	<div class="team-box full">
                        <figure><img src="include/images/member3.jpg" alt="" />
                        	<figcaption>
                            	<h3>PRAGNESH RAMANI</h3>
                                <h6>WEB DEVELOPER</h6>
                            </figcaption>
                        </figure>
                        <div class="team-box-detail">
                        	<div class="member-details">
                        	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque faucibus enim vitae arcu aliquam imperdiet. Morbi efficitur metus a neque egestas pellentesque. Proin lectus tortor, cursus non pretium eu, sagittis in felis. Nam at elit vel enim interdum tincidunt. Curabitur dapibus dui a lectus auctor, ac cursus mi efficitur.</p>
                            <p><a href="#" target="_blank"><i class="ion ion-social-facebook"></i></a><a href="#" target="_blank"><i class="ion ion-social-twitter"></i></a><a href="#" target="_blank"><i class="ion ion-social-instagram"></i></a></p>
                        </div>
                        </div>
                    </div>
                </div>
              
            </div>
        </div>
  </div>
  <!-- inner container end -->
    
    

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