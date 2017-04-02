package com.compare;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import com.register_login.GetsSets;
//import com.register_login.weltest;

/**
 * Servlet implementation class carUpdate
 */
@WebServlet("/compareUpdate")
public class compareUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public compareUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String product1 = request.getParameter("product1");
		String product2 = request.getParameter("product2");
		
		try {
			GetsSetscompare Set = new compareRetrieve().getonedata(product1);
			request.setAttribute("upcomparedb",Set);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			GetsSetscompare Set = new compareRetrieve().getonedata(product2);
			request.setAttribute("upcomparedb1",Set);
			request.getRequestDispatcher("compareUpdate.jsp").forward(request,response);
			
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
