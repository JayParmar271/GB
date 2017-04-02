package com.subcategory;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class carDelete
 */
@WebServlet("/SubcategoryDelete")
public class SubcategoryDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubcategoryDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String subCat_id = request.getParameter("sub_id");
		GetsSetsSubcategory set = new GetsSetsSubcategory();
		set.setSubCat_id(subCat_id);
		
		
		int result;
		try {
			result = SubcategoryDbManager.deleteSubcategory(set);
			if(result!=0){
				System.out.println("Deleted...");
				response.sendRedirect("adminpanel.jsp");
			}else{
				System.out.println("oops..Error : Some fields are missing ..  !!");
				response.sendRedirect("Error.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
