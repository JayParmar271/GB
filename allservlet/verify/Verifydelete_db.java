package com.verify;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_db
 */
@WebServlet("/Verifydelete_db")
public class Verifydelete_db extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verifydelete_db() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String v_id = request.getParameter("v_id");
		VerifyGetsSets set = new VerifyGetsSets();
		set.setV_id(v_id);
		
		
		int result;
		try {
			result = VerifyDbManager.deleteUser(set);
			if(result!=0){
				System.out.println("Deleted...");
				response.sendRedirect("VerifywelServlet");
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
