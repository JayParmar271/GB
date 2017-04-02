package com.register_login;

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
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		String hdnparam = request.getParameter("pagename");
    		
    		if(hdnparam.equals("register")){
    			String firstname  = request.getParameter("textfname");
    			String lastname   = request.getParameter("textlname");
    			String email      = request.getParameter("textemail");
    			String profile    = request.getParameter("textpro");
    			String mobile     = request.getParameter("textmo");
    			String age        = request.getParameter("textage");
    			String gender     = request.getParameter("rogender");
    			String address    = request.getParameter("text_area");
    			String state      = request.getParameter("textstate");
    			String password   = request.getParameter("password");
    			
    			GetsSets set = new GetsSets();
    			
    				set.setFirstname(firstname);
    				set.setLastname(lastname);
    				set.setEmail(email);
    				set.setProfile(profile);
    				set.setMobile(mobile);
    				set.setAge(age);
    				set.setGender(gender);
    				set.setAddress(address);
    				set.setState(state);
    				set.setPassword(password);
    				
    				String sql = "insert into register_db(firstname,lastname,email,profile,mobile,age,gender,address,state,password) values(?,?,?,?,?,?,?,?,?,?)";
					 int i = DbManager.registerUser(set,sql);
					if(i!=0){
						System.out.println("Inserted");
						response.sendRedirect("login.jsp");
					}else{
						System.out.println("oops..Error : Some fields are missing ..  !!");
						response.sendRedirect("Error.jsp");
					}
    		}
    			
    			if(hdnparam.equals("login")){
    				String username = request.getParameter("textid");
    				String pass = request.getParameter("textpass");
    				
    				if((username.equals("admin")) && (pass.equals("admin"))){
    					response.sendRedirect("admin.jsp");
    				}
    				else
    				{
    					
  
    					if(username.equals(null)||username==""||pass.equals(null)||pass=="")
    					{
    						request.setAttribute("msg", "*All Fields Are Mendatory!");
    						getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    					}
    					else
    					{
    					
    						String sql="select * from register_db where email=? and password=?";	  			
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
    										HttpSession session=request.getSession(); 
    										session.setAttribute("uname",firstName); 
    										session.setAttribute("id",u_id);
    										// end set session //
    		    							PrintWriter out = response.getWriter();  
    		    							out.println("<script>alert('Login Successfully')</script>");
    		    							out.println("<script>window.location='index.jsp'</script>");
    									}
        							}
    								catch (SQLException e) {
        							// TODO Auto-generated catch block
        							e.printStackTrace();
        						}
    							System.out.println("ValidUser...");
    							response.sendRedirect("index.jsp");
    						}else{
    							request.setAttribute("msg", "*Enter Correct Email or Password!");
    							System.out.println("InvalidUser..");
    							response.sendRedirect("login.jsp");
    						}

						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					    	
    					}
    			}
						
    			}
    			if(hdnparam.equals("update_register_db")){
    				String firstname  = request.getParameter("textfname");
    				String lastname   = request.getParameter("textlname");
    				String email      = request.getParameter("textemail");
    				String profile    = request.getParameter("textpro");
    				String mobile     = request.getParameter("textmo");
    				String age        = request.getParameter("textage");
    				String gender     = request.getParameter("rogender");
    				String address    = request.getParameter("text_area");
    				String state      = request.getParameter("textstate");
    				String password   = request.getParameter("password");
    				
    				GetsSets set = new GetsSets();
    				
    					set.setFirstname(firstname);
    					set.setLastname(lastname);
    					set.setEmail(email);
    					set.setProfile(profile);
    					set.setMobile(mobile);
    					set.setAge(age);
    					set.setGender(gender);
    					set.setAddress(address);
    					set.setState(state);
    					set.setPassword(password);
    					
    					String sql = "Update register_db set firstname=? ,lastname=? , profile=? ,mobile=? , age=? ,gender=? , address=? , state=? , password=?  where email=?";
    					 int result;
    					try {
    						result = DbManager.updateUser(set,sql);
    						if(result!=0){
    							System.out.println("Updated...");
    							response.sendRedirect("admin.jsp");
    						}else{
    							System.out.println("oops..Error : Some fields are missing ..  !!");
    							response.sendRedirect("Error.jsp");
    						}
    					} catch (SQLException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}

    			}
    		if(hdnparam.equals("Delete_db")){
    			String email = request.getParameter("textemail");
        		GetsSets set = new GetsSets();
        		set.setEmail(email);
        		
        		//String sql = "Delete from register_db where email=?";
        		int result;
        		try {
    				result = DbManager.deleteUser(set);
    				if(result!=0){
    					System.out.println("Deleted...");
    					response.sendRedirect("admin.jsp");
    				}else{
    					System.out.println("oops..Error : Some fields are missing ..  !!");
    					response.sendRedirect("Error.jsp");
    				}
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}

    		}
    		

	}

}
