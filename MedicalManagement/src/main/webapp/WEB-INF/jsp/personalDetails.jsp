<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PERSONAL DETAILS</title>
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
		<font><strong>REPORTS</strong></font>
	</h2>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>

		</tr>
		<tr>
			<td><b>Patient id</b></td>
			<td><b>User Name</b></td>
			<td><b>Phone number</b></td>
			<td><b>E-mail</b></td>
			<td><b>Password</b></td>
			<td><b>City</b></td>
			<td><b>State</b></td>
		</tr>
		<%
			try {
				connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
				statement = connection.createStatement();
				String sql = "SELECT p_id,p_username,p_phno,p_email,p_password,p_city,p_state FROM patient where p_id=1";
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		%>
		<tr>

			<td><%=resultSet.getString("p_id")%></td>
			<td><%=resultSet.getString("p_username")%></td>
			<td><%=resultSet.getString("p_phno")%></td>
			<td><%=resultSet.getString("p_email")%></td>
			<td><%=resultSet.getString("p_password")%></td>
			<td><%=resultSet.getString("p_city")%></td>
			<td><%=resultSet.getString("p_state")%></td>
	
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