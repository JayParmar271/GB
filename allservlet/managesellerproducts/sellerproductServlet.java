package com.managesellerproducts;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company_products.GetsSetsProduct;
import com.company_products.comProductDbManager;

//import com.register_login.DbManager;
//import com.register_login.GetsSets;

/**
 * Servlet implementation class sellerproductServlet
 */
@WebServlet("/sellerproductServlet")
public class sellerproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			String productid = request.getParameter("productid");
			System.out.println(productid);
			GetsSetsProduct Set = new GetsSetsProduct();
			Set.setPid(productid);
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String requiredDate = df.format(new Date()).toString();
			String cur_date = requiredDate;
			Set.setDate(cur_date);
			
			int result;
			try {
				String sql = "Insert Into notification(n_pro_id,date) values(?,?)";
				int i = SellerProductDbManager.insertNotification(Set,sql);
				result = SellerProductDbManager.updateStatus(Set);
				if(result!=0 && i!=0){
					System.out.println("Updated...");
					PrintWriter out = response.getWriter(); 
					out.println("<script>alert('Updated Successfully')</script>");
					out.println("<script>window.location='sellerproductdataServlet'</script>");
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
