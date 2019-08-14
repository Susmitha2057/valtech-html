<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGS OF PATIENT AND ADMIN</title>
</head>
<body>
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>

	<%
		String id = request.getParameter("userId");
		String driverName = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost:3306/";
		String dbName = "medicalmanagement";
		String userId = "root";
		String password = "";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	%>
	<h2 align="center">
		<font><strong>LOGS OF PATIENT AND ADMIN</strong></font>
	</h2>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>

		</tr>
		<tr>
			<td><b>Complicant No</b></td>
			<td><b>Patient id</b></td>
			<td><b>Patient Name</b></td>
			<td><b>Doctor id</b></td>
			<td><b>Doctor Name</b></td>
			<td><b>Complication</b></td>
			<td><b>e-prescription</b></td>
			<td><b>Date of appointment</b></td>
		</tr>
		<%
			try {
				connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
				statement = connection.createStatement();
				String sql = "SELECT * FROM complicant";
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		%>
		<tr>
		
			<td><%=resultSet.getString("complicantNo")%></td>
			<td><%=resultSet.getString("p_id")%></td>
			<td><%=resultSet.getString("p_username")%></td>
			<td><%=resultSet.getString("d_id")%></td>
			<td><%=resultSet.getString("d_username")%></td>
			<td><%=resultSet.getString("complication")%></td>
			<td><%=resultSet.getString("e-prescription")%></td>
			<td><%=resultSet.getString("DOA")%></td>
			
		</tr>

		<%
			}

			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
</body>
</html>