package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {
	public static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/db1";
		java.sql.Connection con=DriverManager.getConnection(url,"root","yogi");
		System.out.println("Database dbemp connection successfully establish");
		// public void insert(List<PersonEntity> personEntities) throws SQLException {

		String query = "INSERT INTO PersonEntity(id, name) VALUES( ?, ?)";

		PreparedStatement preparedStatement = con.prepareStatement(query);

		for (PersonEntity personEntity : personEntities) {

			preparedStatement.setInt(1, personEntity.getId());

			preparedStatement.setString(2, personEntity.getName());

			preparedStatement.addBatch();

		}

		preparedStatement.executeBatch();

	}

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		List<PersonEntity> l = new ArrayList<>();
		l.add(new PersonEntity(6, "sneha"));
//		l.add(new PersonEntity(2, "keerthi"));
//		l.add(new PersonEntity(3, "sanju"));
//		l.add(new PersonEntity(4, "kani"));
//		l.add(new PersonEntity(5, "kerthi"));
		insert(l);
		System.out.println("Record inserted ");

	}

}
