package exceptions;

public class ClassNotFoundEx {
//compile time Ex- also checked exception
	//ex- ClassNotFoundException, IoException, SQLException

	public static void main(String[] args) {
		try {
		Class.forName("class not exist");
		Class.forName("basic.EnumEx11");
		//Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Class found");
		
		}catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
