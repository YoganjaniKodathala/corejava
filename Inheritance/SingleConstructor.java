package Inheritance;
import java.util.Scanner;

class Develop{
	String name = "yoga" ;
	Develop(String nm, String role){
		name = nm;
		System.out.println(name);
	}
}

//subclass
class Student1 extends Develop{
	String role;
	String name;
	
	public Student1(String role,String name) {
		super(name,role);
		this.role = role;
		this.name=name;
		System.out.println(role);
	}
}
public class SingleConstructor{
	public static void main(String[] args) {
		Student1 s1 = new Student1("Java Full Stack","yoga");
	}
		// TODO Auto-generated method stub

	}
