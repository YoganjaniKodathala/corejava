package exceptions;
import  java.util.Scanner;
public class ThrowEx2 {
	static void validagaMarks(int marks) {
		if(marks>0) {
			System.out.println(marks+"is a valid marks");
		}else {
			throw new ArithmeticException("invalid marks");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		validagaMarks(marks);

	}

}
