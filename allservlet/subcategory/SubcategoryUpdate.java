package com.subcategory;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.register_login.GetsSets;
//import com.register_login.weltest;

/**
 * Servlet implementation class carUpdate
 */
@WebServlet("/SubcategoryUpdate")
public class SubcategoryUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubcategoryUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sub_cat_id = request.getParameter("sub_id");
		HttpSession session = request.getSession();
		session.setAttribute("id",sub_cat_id );
		
		try {
			GetsSetsSubcategory Set = new SubcategoryRetrieve().getonedata(sub_cat_id);
			request.setAttribute("upsubcategorydb",Set);
			request.getRequestDispatcher("update_subcategory.jsp").forward(request,response);
			
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
