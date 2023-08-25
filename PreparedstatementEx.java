package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedstatementEx {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/db1";
		java.sql.Connection con=DriverManager.getConnection(url,"root","yogi");
		System.out.println("Database dbemp connection successfully establish");
		//String u="insert into student values(?,?,?)";
		String u="update student set sid=? where sename=?";
		
		PreparedStatement ps = con.prepareStatement(u);
		ps.setInt(1, 4);
		ps.setString(2,"karan" );
	//	ps.setInt(3,26);
		int i=ps.executeUpdate();
		System.out.println("Record inserted :" +i);
		
		


	}

}
