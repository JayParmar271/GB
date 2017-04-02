<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="include/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Lato:400,300,700,900' rel='stylesheet' type='text/css'>
<link href="include/css/ionicons.min.css" rel="stylesheet" type="text/css">
<link href="include/css/animsition.min.css" rel="stylesheet" type="text/css">
<link href="include/css/slick.css" rel="stylesheet" type="text/css">
<link href="include/css/slick-theme.css" rel="stylesheet" type="text/css">
<link href="include/css/style.css" rel="stylesheet" type="text/css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <style>
@CHARSET "ISO-8859-1";
/* CSS used here will be applied after bootstrap.css */

.dropdown {
    display:inline-block;
    margin-left:20px;
    padding:10px;
  }


.glyphicon-bell {
    color:#ffffff;
    font-size:1.5rem;
  }

.notifications {
   min-width:4px; 
   	width:500px
  }
  
  .notifications-wrapper {
     overflow:auto;
    	width:500px
      max-height:250px;
    }
    
 .menu-title {
     color:#ff7788;
     font-size:1.5rem;
      display:inline-block;
      }
 
.glyphicon-circle-arrow-right {
      margin-left:10px;     
   }
  
   
 .notification-heading, .notification-footer  {
 	padding:2px 10px;
       }
      
        
.dropdown-menu.divider {
  margin:5px 0;          
  }

.item-title {
  
 font-size:1.3rem;
 color:#000;
    
}

.notifications a.content {
 text-decoration:none;
 background:#ccc;

 }
    
.notification-item {
 padding:10px;
 margin:5px;
 background:#ccc;
 border-radius:4px;
 }




</style>
    

</head>
<body>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "guidance_boutique";
String userId = "root";
String password = "root";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>			

 <header>
    <div class="container">
      <div class="row">
        <div class="col-sm-12">
          <div class="logo"><a href="index.jsp" class="animsition-link"><img src="include/images/logo.png" alt="PEELAA" /></a></div>
          <div class="header-cart">
          
          <i class="ion ion-arrow-graph-up-right"></i> <a class="cart-contents" href="#" title="Compare Your Choices" onclick="compareSubmit()">Compare <span class="amount">-2 items</span></a></div>
          <div class="nav-menu-icon"><a href="#"><i></i></a></div>
          <nav>
            <ul class="menu">
              <li><a href="index.jsp">Home</a></li>
              <li><a href="products.jsp">Products</a></li>
              <li><a href="products.jsp?category=Insurance">Insurance<span class="ion ion-ios-arrow-down"></span></a>
                <ul class="dropmenu">
                  <li><a href="products.jsp?subcategory=Life Insurance">Life Insurance<span class="ion ion-ios-arrow-down"></span></a>
                    <ul class="submenu">
                      <li><a href="portfolio-detail.html">Life Insurance Companies</a></li>
                      <li><a href="portfolio-detail-2.html">Life Insurance Premium</a></li>
                      <li><a href="portfolio-detail-3.html">Types Of Life Insurance</a></li>
                      <li><a href="portfolio-detail-3.html">Permanent Life Insurance</a></li>
                      <li><a href="portfolio-detail-3.html">Endowment Policy</a></li>
                      <li><a href="portfolio-detail-3.html">Benefits Of Life Insurance</a></li>
                      <li><a href="portfolio-detail-3.html">Life Insurance Death Claim</a></li>
                      <li><a href="portfolio-detail-3.html">Group Life Insurance</a></li>
                      <li><a href="portfolio-detail-3.html">Life Insurance Plan</a></li>
                      <li><a href="portfolio-detail-3.html">Return Of Premium</a></li>
                      </ul>
                  </li>
                  <li><a href="products.jsp?subcategory=Health Insurance">Health Insurance<span class="ion ion-ios-arrow-down"></span></a>
                    <ul class="submenu">
                      <li><a href="portfolio-detail.html">Detail 1</a></li>
                      <li><a href="portfolio-detail-2.html">Detail 2</a></li>
                      <li><a href="portfolio-detail-3.html">Detail 3</a></li>
                    </ul>
                  </li>
                  <li><a href="products.jsp?subcategory=Motor Insurance">Motor Insurance<span class="ion ion-ios-arrow-down"></span></a>
                    <ul class="submenu">
                      <li><a href="portfolio-detail.html">Detail 1</a></li>
                      <li><a href="portfolio-detail-2.html">Detail 2</a></li>
                      <li><a href="portfolio-detail-3.html">Detail 3</a></li>
                    </ul>
                  </li>
                  <li><a href="products.jsp?subcategory=Travel Insurance">Travel Insurance<span class="ion ion-ios-arrow-down"></span></a>
                    <ul class="submenu">
                      <li><a href="portfolio-detail.html">Detail 1</a></li>
                      <li><a href="portfolio-detail-2.html">Detail 2</a></li>
                      <li><a href="portfolio-detail-3.html">Detail 3</a></li>
                    </ul>
                  </li>
                </ul>
              </li>
              <li><a href="products.jsp?category=Loan">Loans<span class="ion ion-ios-arrow-down"></span></a>
                <ul class="dropmenu">
                  <li><a href="products.jsp?subcategory=Personal Loan">Personal Loan</a></li>
                  <li><a href="products.jsp?subcategory=Home Loan">Home Loan</a></li>
                  <li><a href="products.jsp?subcategory=Car Loan">Car Loan</a></li>
                  <li><a href="products.jsp?subcategory=Education Loan">Education Loan</a></li>
                  <li><a href="products.jsp?subcategory=Tax Calculator">Tax Calculator</a></li>
                </ul>      
                 </li>
              <li><a href="products.jsp?category=Credit Card">Credit Cards<span class="ion ion-ios-arrow-down"></span></a>
                <ul class="dropmenu">
                <li><a href="#">Credit Card Apply</a></li>
                <li><a href="#">Travel Credit Cards</a></li>
                <li><a href="#">Dining Credit Cards</a></li>
                </ul>
              </li>
              <li><a href="#">Others<span class="ion ion-ios-arrow-down"></span></a>
                <ul class="dropmenu">
               <li><a href="#">About</a></li>
               <li><a href="#">Services</a></li>
               <li><a href="contact_us.jsp">Contact</a></li>
               <li><a href="#">Notification</a></li>  
                </ul>
              </li>
         	    <li><a href="#">
         	    <% if(session.getAttribute("uname") == null) {%>
         	     Welcome Guest
         	     <span class="ion ion-ios-arrow-down"></span></a>
         	     <ul class="dropmenu">
                <li><a href="login.jsp">Login</a></li>
                <li><a href="signup.jsp">SignUp</a></li>
         	    <% } %>
         	    <%  if(session.getAttribute("uname") != null) { %>
         	    <%= session.getAttribute("uname") %>
         	     <span class="ion ion-ios-arrow-down"></span></a>
         	     <ul class="dropmenu">
         	     <li><a href="cart.jsp">Cart</a></li>
         	      <li><a href="logout.jsp">Logout</a></li>
                </ul>
         	    <% } %>
				 </ul>
				 <ul>
				 	<!-- Notification Start -->
			<div class="dropdown">
			  <a id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#">
			    <i class="glyphicon glyphicon-bell"></i>
			  </a>
			  
			  <ul class="dropdown-menu notifications" role="menu" aria-labelledby="dLabel">
			    
			    <div class="notification-heading"><h4 class="menu-title">Notifications</h4><h4 class="menu-title pull-right">View all<i class="glyphicon glyphicon-circle-arrow-right"></i></h4>
			    </div>
			    <li class="divider"></li>
			   <div class="notifications-wrapper">
			     <a class="content" href="#">
			       <div class="notification-item">
			       <%
					try{ 
					connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
					statement=connection.createStatement();
					String userid = session.getAttribute("id").toString();
					String sql = "SELECT * FROM verify AS v INNER JOIN usernotification AS un ON v.v_id=un.n_pro_id WHERE v.v_u_id='"+ userid +"'";
					resultSet = statement.executeQuery(sql);
					
					while(resultSet.next()){
					%>
			       
			        <p class="item-info"><%=resultSet.getString("v_photo_add_name")%> is Approved.</p>
			        <h4 class="item-title">Approved At:<%=resultSet.getString("date") %></h4>
			        
			        
			        <% 
					}
					} catch (Exception e) {
					e.printStackTrace();
					}
					%>
			      </div>
			    </a>
			   </div>
			    <li class="divider"></li>
			    <div class="notification-footer"><h4 class="menu-title">View all<i class="glyphicon glyphicon-circle-arrow-right"></i></h4></div>
			  </ul>
			  
			</div>	
			<!-- Notification End -->
				 </ul>
              </li>
            </ul>
          </nav>
        </div>
      </div>
    </div>
  </header>
 
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