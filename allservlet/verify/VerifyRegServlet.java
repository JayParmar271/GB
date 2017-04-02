package com.verify;

import java.io.IOException;
//import java.sql.SQLException;

import java.io.InputStream;
import java.io.PrintWriter;
//import java.io.InputStream;
//import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.company_products.GetsSetsProduct;
import com.managesellerproducts.SellerProductDbManager;
/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/VerifyRegServlet")
@MultipartConfig(maxFileSize = 16177215) 
public class VerifyRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		String hdnparam = request.getParameter("pagename");
    		
    		if(hdnparam.equals("verify")){
    			System.out.println("Hello");
    			String ver_id = request.getParameter("verid");
    			String v_name = request.getParameter("name");
    			String v_dob = request.getParameter("date");
    			String v_photo_id_name = request.getParameter("photo_id_name");
    			String v_photo_add_name = request.getParameter("photo_add_name");
    			String v_add = request.getParameter("address");
    			HttpSession session=request.getSession(); 
    			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    			String requiredDate = df.format(new Date()).toString();
    			String cur_date = requiredDate;
    			
     			String u_id = session.getAttribute("id").toString();
    			InputStream inputStream1 = null; 
    			InputStream inputStream2 = null;
    			InputStream inputStream3 = null;
    		 // input stream of the upload file
    	         
    	        // obtains the upload file part in this multipart request
    	        Part filePart1 = request.getPart("v_photo");
    	        Part filePart2 = request.getPart("v_photo_id");
    	        Part filePart3 = request.getPart("v_photo_add");
    	        if (filePart1!= null) {
    	            // prints out some information for debugging
    	            System.out.println(filePart1.getName());
    	            System.out.println(filePart1.getSize());
    	            System.out.println(filePart1.getContentType());
    	             
    	            // obtains input stream of the upload file
    	            inputStream1 =   filePart1.getInputStream();
    	        }
    	        System.out.println("Input Stream 3 :"+inputStream1);
    	        if (filePart2!= null) {
    	            // prints out some information for debugging
    	            System.out.println(filePart2.getName());
    	            System.out.println(filePart2.getSize());
    	            System.out.println(filePart2.getContentType());
    	             
    	            // obtains input stream of the upload file
    	            inputStream2 =   filePart2.getInputStream();
    	        }
    	        System.out.println("Input Stream 2 :"+inputStream2);
    	        if (filePart3!= null) {
    	            // prints out some information for debugging
    	            System.out.println(filePart3.getName());
    	            System.out.println(filePart3.getSize());
    	            System.out.println(filePart3.getContentType());
    	             
    	            // obtains input stream of the upload file
    	            inputStream3 =   filePart3.getInputStream();
    	        }
    	        System.out.println("Input Stream 1 : "+inputStream3);
    			VerifyGetsSets set = new VerifyGetsSets();

    				set.setV_name(v_name);
    				set.setV_dob(v_dob);
    				set.setV_photo(inputStream1);
    				set.setV_photo_id_name(v_photo_id_name);
    				set.setV_photo_id(inputStream2);
    				set.setV_photo_add_name(v_photo_add_name);
    				set.setV_photo_add(inputStream3);
    				set.setV_add(v_add);
    				set.setU_id(u_id);
    				set.setVer_id(ver_id);
    				set.setDate(cur_date);
    				
    				
    				String sql = "insert into verify(v_name,v_u_id,v_dob,v_photo,v_photo_id_name,v_photo_id,v_photo_add_name,v_photo_add,v_add) values(?,?,?,?,?,?,?,?,?)";
    				ConnectionManager c = new ConnectionManager();
    				Connection conn=c.connect();
    				int i=0 ;
    				if(conn!=null){
    					try {
    						PreparedStatement psmt = conn.prepareStatement(sql);
    						psmt.setString(1, set.getV_name());
    						psmt.setString(2, set.getU_id());
    						psmt.setString(3,set.getV_dob());
    						//psmt.setBlob(3,inputStream1);
    						psmt.setBinaryStream(4, inputStream1, (int) filePart1.getSize());
    						psmt.setString(5,set.getV_photo_id_name());
    						//psmt.setBlob(5,inputStream2);
    						psmt.setBinaryStream(6, inputStream2, (int) filePart2.getSize());
    						psmt.setString(7,set.getV_photo_add_name());
    						//psmt.setBlob(7,inputStream3);
    						psmt.setBinaryStream(8, inputStream3, (int) filePart3.getSize());
    						psmt.setString(9, set.getV_add()); 
    						
    				 
    				            // sends the statement to the database server
    				            
    						 i = psmt.executeUpdate();
    					} catch (SQLException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    					
    					
    				} 
    				//int i = CompDbManager.registerUser(set,sql);
					if(i!=0){
						System.out.println("Inserted");
						response.sendRedirect("login.jsp");
					}else{
						System.out.println("oops..Error : Some fields are missing ..  !!");
						response.sendRedirect("Error.jsp");
					}
    		}
    			

    		
    		

	}
    	
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub

    			String ver_id = request.getParameter("verid");
    			System.out.println(ver_id);
    			VerifyGetsSets set = new VerifyGetsSets();
    			set.setVer_id(ver_id);
				
    			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    			String requiredDate = df.format(new Date()).toString();
    			String cur_date = requiredDate;
    			set.setDate(cur_date);
    			
    			int result1;
				String sql1 = "Insert Into usernotification(n_pro_id,date) values(?,?)";
				int i1 = VerifyDbManager.insertNotification(set,sql1);
				try {
					result1 = VerifyDbManager.updateStatus(set);
					if(result1!=0 && i1!=0){
    					System.out.println("Updated...");
    					PrintWriter out = response.getWriter(); 
    					out.println("<script>alert('Updated Successfully')</script>");
    					out.println("<script>window.location='VerifywelServlet'</script>");
    				}else{
    					System.out.println("oops..Error : Some fields are missing ..  !!");
    					response.sendRedirect("Error.jsp");
    				}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}

}
