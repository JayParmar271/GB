package com.company_login;

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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		String hdnparam = request.getParameter("pagename");
    		  			
    			if(hdnparam.equals("companylogin")){
    				String username = request.getParameter("textid");
    				String pass = request.getParameter("textpass");
    				String profile = "Company";
  
    					if(username.equals(null)||username==""||pass.equals(null)||pass=="")
    					{
    						request.setAttribute("msg", "*All Fields Are Mendatory!");
    						getServletContext().getRequestDispatcher("companylogin.jsp").forward(request,response);
    					}
    					else
    					{
    					
    						String sql="select * from register_db where email=? and password=? and profile='"+profile+"'";	  			
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
    										String firstName = rs.getString("firstname");
    										String u_id = rs.getString("u_id");
    										String profile1 = rs.getString("profile");
    										HttpSession session=request.getSession(); 
    										session.setAttribute("uname",firstName); 
    										session.setAttribute("comid",u_id);
    										session.setAttribute("profile",profile1);
    										// end set session //
    		    							PrintWriter out = response.getWriter();  
    		    							out.println("<script>alert('Login Successfully')</script>");
    		    							out.println("<script>window.location='companypanel.jsp'</script>");
    									}
        							}
    								catch (SQLException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						}
    							System.out.println("ValidUser...");
    							response.sendRedirect("companypanel.jsp");
    						}else{
    							request.setAttribute("msg", "*Enter Correct Email or Password!");
    								System.out.println("InvalidUser..");
    							response.sendRedirect("companylogin.jsp");
    						}

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					    	
    				}
    			}
    		
	}

}
