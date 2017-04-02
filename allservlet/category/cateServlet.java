package com.category;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//import com.car_loan.CarDbManager;
//import com.car_loan.GetsSetsCar;
import com.register_login.DbManager;
import com.register_login.GetsSets;

/**
 * Servlet implementation class cateServlet
 */
@WebServlet("/cateServlet")
public class cateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String hdnparam = request.getParameter("pagename");
		
		if(hdnparam.equals("insert_category")){
			String catname  = request.getParameter("textcatename");
			
			GetsSetsCate set = new GetsSetsCate();
			
				set.setCatName(catname);
				
				String sql = "insert into category(cat_name) values(?)";
				 int i = cateDbManager.insertUser(set,sql);
				if(i!=0){
					System.out.println("Inserted");
					response.sendRedirect("login.jsp");
				}else{
					System.out.println("oops..Error : Some fields are missing ..  !!");
					response.sendRedirect("Error.jsp");
				}
		}
			
			
					
			if(hdnparam.equals("Update_category")){
				String catname  = request.getParameter("textcatename");
				HttpSession session = request.getSession();
				String cat_id = (String) session.getAttribute("id");
				GetsSetsCate set = new GetsSetsCate();
				
					set.setCatName(catname);
					set.setCat_id(cat_id);
					String sql = "UPDATE  category SET cat_name=? WHERE cat_id=?";
					 int result;
					try {
						result = cateDbManager.updateCate(set,sql);
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
