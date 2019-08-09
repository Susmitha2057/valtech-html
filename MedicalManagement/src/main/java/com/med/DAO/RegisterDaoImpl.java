package com.med.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.med.model.Register;
import com.mysql.jdbc.Statement;

@Repository
public class RegisterDaoImpl {
	
	public boolean createPatient(Connection conn, Register patient) {
		Statement statement = null;
		try {
			statement = (Statement) conn.createStatement();
			System.out.println(patient.getPassword());
			String sql = "Insert into patient(p_username,p_phno,p_email ,p_password,p_city,p_state) values ('"+patient.getUserName()+"',"+patient.getPhoneno()+",'"+patient.getEmail()+"','"+patient.getPassword()+"','"+patient.getCity()+"','"+patient.getState()+"')";
			statement.executeUpdate(sql);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
