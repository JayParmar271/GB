package com.admin_login;

import java.io.IOException;
//import java.sql.SQLException;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		String hdnparam = request.getParameter("pagename");
    		  			
    			if(hdnparam.equals("adminlogin")){
    				String username = request.getParameter("textid");
    				String pass = request.getParameter("textpass");
  
    					if(username.equals(null)||username==""||pass.equals(null)||pass=="")
    					{
    						request.setAttribute("msg", "*All Fields Are Mendatory!");
    						getServletContext().getRequestDispatcher("adminlogin.jsp").forward(request,response);
    					}
    					else
    					{
    					
    						String sql="select * from admin where username=? and password=?";	  			
    						GetsSets set = new GetsSets();
    				  	
    						set.setEmail(username);
    						set.setPassword(pass);
    						int checkUser;
    						try 
    						{
    							checkUser = DbManager.checkUser(set);
    							System.out.println(checkUser);
    							if(checkUser == 1)
    							{
    								ResultSet rs=DbManager.loginUser(set,sql);
    								try
    								{
    									if(rs.next())
    									{
    										// set session // 
    										String user_name = rs.getString("username");
    										String id = rs.getString("id");
    										System.out.println(user_name);
    										HttpSession session=request.getSession(); 
    										session.setAttribute("username",user_name); 
    										session.setAttribute("adminid",id); 
    										// end set session //
    		    							PrintWriter out = response.getWriter();  
    		    							out.println("<script>alert('Login Successfully')</script>");
    		    							out.println("<script>window.location='adminpanel.jsp'</script>");
    									}
        							}
    								catch (SQLException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						}
    							System.out.println("ValidUser...");
    							response.sendRedirect("adminpanel.jsp");
    						}else{
    							request.setAttribute("msg", "*Enter Correct Email or Password!");
    							System.out.println("InvalidUser..");
    							response.sendRedirect("adminlogin.jsp");
    						}

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					    	
    				}
    			}
    		
	}

}
