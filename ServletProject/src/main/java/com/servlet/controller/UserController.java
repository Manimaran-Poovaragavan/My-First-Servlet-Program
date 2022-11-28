package com.servlet.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.servlet.db.Databaseutil;
import com.servlet.dto.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserSubmit")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("submit this....");
		
		String firstname =request.getParameter(("firstname"));
		String fathername =request.getParameter(("fathername"));
        String dob = request.getParameter(("dob"));
		String mobileno =request.getParameter(("mobileno"));
		String email =request.getParameter(("email"));
		String qualification =request.getParameter(("qualification"));
		
		System.out.println(firstname+"...."+fathername+"...."+dob+"...."+mobileno+"..."+email+"..."+qualification);
		
		User userobj = new User();		
		userobj.setFirstname(firstname);
		userobj.setFathername(fathername);
		userobj.setDob(dob);
		userobj.setMobileno(mobileno);
		userobj.setEmail(email);
		userobj.setQualification(qualification);
		Databaseutil.save(userobj);
		
		response.sendRedirect("UserList");
	//	request.setAttribute("userobj", userobj);
		
	//	request.getRequestDispatcher("UserList.jsp").include(request, response);
		
		//response.sendRedirect("UserList.jsp");
	}

}
