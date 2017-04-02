package com.cart;

import java.io.IOException;
import java.sql.Connection;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.register_login.DbManager;
//import com.register_login.GetsSets;

import javax.servlet.http.HttpSession;

import com.cart.GetsSetsCart;
import com.cart.CartDbManager;
import com.register_login.ConnectionManager;

/**
 * Servlet implementation class addcartServlet
 */
@WebServlet("/addCartServlet")
public class addCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		String pid  = request.getParameter("id");
    		//System.out.println("pid"+pid);
    		HttpSession session=request.getSession();
    		String uid=session.getAttribute("id").toString();
    		//System.out.println("uid"+uid);
    		GetsSetsCart set = new GetsSetsCart();
    		set.setUid(uid);
			set.setPid(pid);
			String check = "SELECT count(*) FROM CART WHERE p_id='"+pid+"' AND u_id='"+uid+"';";
			System.out.println(check);
			 int j = CartDbManager.checkCart(check);
			 System.out.println(j);
			 if(j==1){
				 PrintWriter out = response.getWriter();  
				 out.println("<script>alert('already in cart')</script>");
				 out.println("<script>window.location='products.jsp'</script>");
			 }
			else{
	    		String sql = "INSERT INTO CART(p_id,u_id) values(?,?)";
				 int i = CartDbManager.insertCart(set,sql);
				if(i!=0){
					//System.out.println("Inserted");
					PrintWriter out = response.getWriter();  
					out.println("<script>alert('added to cart')</script>");
					out.println("<script>window.location='products.jsp'</script>");
					//response.sendRedirect("login.jsp");
				}else{
					System.out.println("oops..Error : Some fields are missing ..  !!");
					response.sendRedirect("Error.jsp");
				}
			}
   	    }
    }
