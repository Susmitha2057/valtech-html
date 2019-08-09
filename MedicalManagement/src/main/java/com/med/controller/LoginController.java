package com.med.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.med.model.Login;

@Controller
public class LoginController {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/medicalmanagement";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	@RequestMapping(value = "/AdminPage", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute("login") Login login) {
		ModelAndView modelAndView = new ModelAndView("Login");
		
		System.out.println(login.getUsername() + " " + login.getPassword());
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 3: Execute a query
			System.out.println("Connected database successfully...");
			stmt = conn.createStatement();
			String sql = "SELECT a_username, a_password FROM admin";
			ResultSet rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				// Retrieve by column name
				String username = rs.getString("a_username");
				String password = rs.getString("a_password");
				if ((login.getUsername()).equals(username) && (login.getPassword()).equals(password)) {
					System.out.println(username + " " + password);
					modelAndView = new ModelAndView("adminPage");
					return modelAndView;
				}

			}
			// STEP 5: Clean-up environment
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		modelAndView = new ModelAndView("admin");
		modelAndView.addObject("message", "Username or password invalid");
		return modelAndView;
	}

}



