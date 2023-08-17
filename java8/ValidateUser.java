package java8;

import java.util.Scanner;

@FunctionalInterface
interface Validate{
	boolean login(String uname,String password);
	
}

public class ValidateUser {
	
public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter user name and password");
//		String uname = sc.next();
//		String password = sc.next();
		
		Validate v=(String u, String pass)->
		{
			
			if((u=="ABC") && (pass=="DEF")) {
				return true;
			}
			else {
				return false;
			}
			
			
		};
		
		//ValidateUser v=new ValidateUser();
		System.out.println(v.login("ABC", "DEF"));

	}

}
