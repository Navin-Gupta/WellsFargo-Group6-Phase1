package com.wf.training.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wf.training.web.model.Student;

/**
 * Servlet implementation class ProfileServ
 */
@WebServlet("/profile")
public class ProfileServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fetch/access the profile info
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		// add business logic: validation, db ...
		// assemble info as object
		Student student = new Student(name, email, contact);
		
		
		// make a provision to share data with JSP
		
		// request : container
		request.setAttribute("student", student);
		
		// Student stud1 = (Student)request.getAttribute("student");
		
		/*
		// session : container
		HttpSession session = request.getSession();  // unique to a client
		session.setAttribute("student", student);
		// Student stud2 = (Student)session.getAttribute("student");
		/*
		// servletContext/application : container
		ServletContext context =  this.getServletContext();
		context.setAttribute("student", student);
		Student stud3 = (Student)context.getAttribute("student");
		*/
		
		// respond back to client (JSP)
		// sendRedirect : terminates the the current cycle, and starts new one
		// response.sendRedirect("profile-show.jsp");
		
		// would to continue the same cycle
		RequestDispatcher dispatcher = request.getRequestDispatcher("profile-show.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}














