package Inheritance;

class Student{
	String name = "yoga";
	
	void display() {
		System.out.println(name);
	}
}
//superclass
class Developer extends Student {
	String role = "Full Stack Developer";
	void displayRole() {
		System.out.println(role);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Developer d1 = new Developer();
				d1.display();
				d1.displayRole();
		
		// TODO Auto-generated method stub

	}

}
