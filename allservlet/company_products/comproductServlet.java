package com.company_products;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.PrintWriter;
//import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.register_login.DbManager;
//import com.register_login.GetsSets;

/**
 * Servlet implementation class carServlet
 */
@WebServlet("/comproductServlet")
public class comproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String hdnparam = request.getParameter("pagename");
    		
    		if(hdnparam.equals("insert_product")){
    			String producttitle  = request.getParameter("producttitle");
    			String category = request.getParameter("category");
    			String subcategory = request.getParameter("subcategory");
    			String company = request.getParameter("company");
    			String startdate = request.getParameter("startdate");
    			String enddate = request.getParameter("enddate");
    			String emi = request.getParameter("emi");
    			String price = request.getParameter("price");
    		    HttpSession session=request.getSession(); 
    			String id = session.getAttribute("comid").toString(); 
    			String uname = session.getAttribute("uname").toString();
    			String status = "d";
    			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    			String requiredDate = df.format(new Date()).toString();
    			String cur_date = requiredDate;
    	
    	 		GetsSetsProduct set = new GetsSetsProduct();
    			
    				set.setProducttitle(producttitle);
    				set.setCategory(category);
    				set.setSubcategory(subcategory);
    				set.setCompany(company);
    				set.setPrice(price);
    				set.setStartdate(startdate);
    				set.setEnddate(enddate);
    				set.setEmi(emi);
    				set.setId(id);
    				set.setUname(uname);
    				set.setStatus(status);
    				set.setDate(cur_date);
    				
    				String sql = "insert into products(p_title,p_cat_id,p_subcat_id,p_com_id,p_start_date,p_end_date,p_emi,p_price,uploaded_by,status) values(?,?,?,?,?,?,?,?,?,?)";
					//String sql1 = "Insert Into notification(n_pro_name,n_u_id,date) values(?,?,?)";
					int i = comProductDbManager.insertProduct(set,sql);
					//int j = comProductDbManager.insertNotification(set,sql1);
					if(i!=0){
						System.out.println("Inserted");
						response.sendRedirect("companypanel.jsp");
					}else{
						System.out.println("oops..Error : Some fields are missing ..  !!");
						response.sendRedirect("Error.jsp");
					}
					
    		}
    			
    			
						
    			if(hdnparam.equals("update_product")){
    				
    				//HttpSession s = null;
    				HttpSession session = request.getSession();
    				String p_id = (String) session.getAttribute("id");
    				String producttitle  = request.getParameter("producttitle");
        			String category = request.getParameter("category");
        			String subcategory = request.getParameter("subcategory");
        			String company = request.getParameter("company");
        			String startdate = request.getParameter("startdate");
        			String enddate = request.getParameter("enddate");
        			String emi = request.getParameter("emi");
        			String price = request.getParameter("price");
        			String id = session.getAttribute("id").toString(); 

        			GetsSetsProduct Set = new GetsSetsProduct();
        			
        			Set.setProducttitle(producttitle);
    				Set.setCategory(category);
    				Set.setSubcategory(subcategory);
    				Set.setCompany(company);
    				Set.setPrice(price);
    				Set.setStartdate(startdate);
    				Set.setEnddate(enddate);
    				Set.setEmi(emi);
    				Set.setPid(p_id);
    				Set.setId(id);

    					 int result;
    					try {
    						result = comProductDbManager.updateCar(Set);
    						if(result!=0){
    							System.out.println("Updated...");
    							PrintWriter out = response.getWriter(); 
    							out.println("<script>alert('Updated Successfully')</script>");
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
    		/*if(hdnparam.equals("Delete_db")){
    			String email = request.getParameter("textemail");
        		GetsSets set = new GetsSets();
        		set.setEmail(email);
        		
        		//String sql = "Delete from register_db where email=?";
        		int result;
        		try {
    				result = DbManager.deleteUser(set);
    				if(result!=0){
    					System.out.println("Deleted...");
    					response.sendRedirect("admin.jsp");
    				}else{
    					System.out.println("oops..Error : Some fields are missing ..  !!");
    					response.sendRedirect("Error.jsp");
    				}
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}

    		}*/
    		

	}

}
