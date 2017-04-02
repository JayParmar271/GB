package com.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class carDelete
 */
@WebServlet("/cartDelete")
public class cartDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cartDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cart_id = request.getParameter("cid");
		GetsSetsCart set = new GetsSetsCart();
		HttpSession session=request.getSession();
		String uid=session.getAttribute("id").toString();
		set.setCid(cart_id);
		set.setUid(uid);
		
		int result;
		try {
			result = CartDbManager.deleteCart(set);
			if(result!=0){
				PrintWriter out = response.getWriter();
				out.println("<script>alert('deleted')</script>");
				out.println("<script>window.location='cart.jsp'</script>");
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
