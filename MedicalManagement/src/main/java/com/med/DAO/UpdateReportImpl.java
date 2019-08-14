package com.med.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.med.model.UpdateReport;
import com.mysql.jdbc.Statement;

@Repository
public class UpdateReportImpl {
			
			public boolean report(Connection conn, UpdateReport report) {
				Statement statement = null;
				try {
					statement = (Statement) conn.createStatement();
					String sql = "Insert into report(p_id,d_id,prescription) values ("+report.getPatientid()+","+report.getDoctorid()+",'"+report.getPrescription()+"')";
					statement.executeUpdate(sql);
					return true;

				} catch (SQLException e) {

					e.printStackTrace();
					return false;
				}
			}
		}

