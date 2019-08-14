package com.med.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.med.model.Complicant;
import com.mysql.jdbc.Statement;
@Repository
public class ComplicantImpl {
		
		public boolean complicant(Connection conn, Complicant compli) {
			Statement statement = null;
			try {
				statement = (Statement) conn.createStatement();
				System.out.println(compli.getId());
				String sql = "Insert into complicant(p_id,p_username,d_id,d_username,complication) values ("+compli.getId()+",'"+compli.getUname()+"',"+compli.getDoctorId()+",'"+compli.getDoctorName()+"','"+compli.getComplicant()+"')";
				statement.executeUpdate(sql);
				return true;

			} catch (SQLException e) {

				e.printStackTrace();
				return false;
			}
		}
	}
