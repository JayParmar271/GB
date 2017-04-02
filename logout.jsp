<% 
if(session.getAttribute("comid") != null)
{
	session.invalidate();
	response.sendRedirect("companylogin.jsp");
}
else if(session.getAttribute("adminid") != null){
	session.invalidate();
	response.sendRedirect("adminlogin.jsp");
}
else{
session.invalidate();
response.sendRedirect("index.jsp");
}
 %>