package com.verify;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class update_Db
 */
@WebServlet("/Verifyupdate_Db")
public class Verifyupdate_Db extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verifyupdate_Db() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String v_id = request.getParameter("v_id");
		HttpSession session = request.getSession();
		session.setAttribute("id",v_id );	
	
		try {
			VerifyGetsSets set = new Verifyweltest().getonedata(v_id);
			request.setAttribute("verifydb",set);
			request.getRequestDispatcher("verify_retrive.jsp").forward(request,response);
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
		//String email = request.getParameter("email");
		
		
			
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}

}
