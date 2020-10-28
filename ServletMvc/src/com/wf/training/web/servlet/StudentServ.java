package com.wf.training.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wf.training.web.dao.StudentDao;

/**
 * Servlet implementation class StudentServ
 */
@WebServlet("/student")
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudentDao studentDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServ() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // init hook method
    @Override
    public void init(ServletConfig config) throws ServletException {
    	String driver = config.getServletContext().getInitParameter("jdbcDriver");
    	String url = config.getServletContext().getInitParameter("jdbcUrl");
    	String username= config.getServletContext().getInitParameter("jdbcUsername");
    	String password= config.getServletContext().getInitParameter("jdbcPassword");
    	
    	this.studentDao = new StudentDao(driver, url, username, password);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fetch the action value
		String action = request.getParameter("action");
		
		String responseAction = "";
		
		switch(action) {
		case "menu" : responseAction = "main-menu.jsp"; 
			break;
		case "entry" : responseAction = "profile-entry.jsp"; 
			break;
		default : break;
		
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher(responseAction);
		dispatch.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
