package com.category;

import java.io.IOException;
//import java.sql.SQLException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.car_loan.CarDbManager;
//import com.car_loan.GetsSetsCar;

/**
 * Servlet implementation class cateDelete
 */
@WebServlet("/cateDelete")
public class cateDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cateDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cat_id = request.getParameter("cat_id");
		GetsSetsCate set = new GetsSetsCate();
		set.setCat_id(cat_id);
		
		
		int result;
		try {
			result = cateDbManager.deleteCate(set);
			if(result!=0){
				System.out.println("Deleted...");
				response.sendRedirect("login.jsp");
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
