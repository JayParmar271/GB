package com.subcategory;

import java.io.IOException;
//import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.register_login.DbManager;
//import com.register_login.GetsSets;

/**
 * Servlet implementation class carServlet
 */
@WebServlet("/SubcategoryServlet")
public class SubcategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String hdnparam = request.getParameter("pagename");
    		
    		if(hdnparam.equals("insert_subcategory")){
    			String sub_cat_name  = request.getParameter("sub_cat_name");
    			String sub_cat_desc = request.getParameter("sub_cat_desc");
    			
    	
    	 		GetsSetsSubcategory set = new GetsSetsSubcategory();
    			
    				set.setSubCat_name(sub_cat_name);
    				set.setSubCat_desc(sub_cat_desc);
    				    				
    				
    				String sql = "insert into subcategory(sub_name,sub_description) values(?,?)";
					 int i = SubcategoryDbManager.insertUser(set,sql);
					if(i!=0){
						System.out.println("Inserted");
						response.sendRedirect("login.jsp");
					}else{
						System.out.println("oops..Error : Some fields are missing ..  !!");
						response.sendRedirect("Error.jsp");
					}
    		}
    			
    			
						
    			if(hdnparam.equals("update_subcategory")){
    				
    				//HttpSession s = null;
    				HttpSession session = request.getSession();
    				String sub_cat_id = (String) session.getAttribute("id");
    				String sub_cat_name  = request.getParameter("sub_cat_name");
        			String sub_cat_desc = request.getParameter("sub_cat_desc");

        			//String car_id = request.getParameter("car_id");
        			GetsSetsSubcategory Set = new GetsSetsSubcategory();
        			
        			Set.setSubCat_name(sub_cat_name);
    				Set.setSubCat_desc(sub_cat_desc);
    				Set.setSubCat_id(sub_cat_id);
    					 int result;
    					try {
    						result = SubcategoryDbManager.updateSubcategory(Set);
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
    		/*if(hdnparam.equals("Delete_db")){
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

    		}*/
    		

	}

}
