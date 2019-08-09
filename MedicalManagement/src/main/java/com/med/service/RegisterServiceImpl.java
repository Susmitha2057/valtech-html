package com.med.service;
import java.sql.Connection;
import com.med.model.Register;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.med.DAO.RegisterDaoImpl;
@Service
public class RegisterServiceImpl implements RegisterService{
	
	RegisterDaoImpl registerDaoImpl = new RegisterDaoImpl();

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/medicalmanagement";

	static final String USER = "root";
	static final String PASS = "";

	public boolean createPatient(Register patient) {
		Connection conn = null;
		try {

			Class.forName(JDBC_DRIVER);

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("Connected database successfully...");
			if (registerDaoImpl.createPatient(conn, patient)) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return false;
		
	}
}
