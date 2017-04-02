<!DOCTYPE html>
<html>
<head>
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

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Guidance Boutique-Dashboard</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/notification.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			<a class="navbar-brand" href="#"><img src="include/images/LogoCompany.png" alt="GB" /></a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg><%= session.getAttribute("uname") %><span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="logout.jsp"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
			
			
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

<ul style="margin-top:18px;">

			<!-- Notification Start -->
			<div class="dropdown">
			  <a id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="">
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
					String userid = session.getAttribute("comid").toString();
					String sql = "SELECT * FROM products AS p INNER JOIN notification AS n ON p.p_id=n.n_pro_id WHERE p.uploaded_by='"+ userid +"'";
					resultSet = statement.executeQuery(sql);
					
					while(resultSet.next()){
					%>
			       
			        <p class="item-info"><%=resultSet.getString("p_title")%> is Approved.</p>
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
		</div><!-- /.container-fluid -->
		</ul>
		</div>
	</nav>
</body>
</html>
