package jdbc;

import java.sql.*;

public class Connection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement stmt;
		String url="jdbc:mysql://localhost:3306/db1";
		java.sql.Connection con=DriverManager.getConnection(url,"root","yogi");
		System.out.println("Database dbemp connection successfully establish");
		stmt=con.createStatement();
		String query1 = "INSERT INTO emp1 values(4,'anjali',22)";
		stmt.executeUpdate(query1);
		System.out.println("Record is inserted in the table successfully");
	

	}

}

		


