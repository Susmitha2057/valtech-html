package com.med.service;

import com.med.DAO.UpdateReportImpl;
import java.sql.Connection;
import com.med.model.UpdateReport;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.stereotype.Service;

@Service
public class UpdateReportServiceImpl implements UpdateReportService {
		
		UpdateReportImpl updateReportImpl = new UpdateReportImpl();

		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:3306/medicalmanagement";

		static final String USER = "root";
		static final String PASS = "";

		public boolean updateReport(UpdateReport report) {
			Connection conn = null;
			try {

				Class.forName(JDBC_DRIVER);

				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

				System.out.println("Connected database successfully...");
				if (updateReportImpl.report(conn, report)) {
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

