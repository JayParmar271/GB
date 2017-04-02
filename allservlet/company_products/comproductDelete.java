package com.company_products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class carDelete
 */
@WebServlet("/comproductDelete")
public class comproductDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public comproductDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p_id = request.getParameter("p_id");
		GetsSetsProduct set = new GetsSetsProduct();
		set.setPid(p_id);
		
		
		int result;
		try {
			result = comProductDbManager.deleteProduct(set);
			if(result!=0){
				System.out.println("Deleted...");
				PrintWriter out = response.getWriter(); 
				out.println("<script>alert('Deleted Successfully')</script>");
				out.println("<script>window.location='comproductdataServlet'</script>");
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
