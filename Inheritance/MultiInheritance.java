package Inheritance;
class Item{   
	String item = "Laptop";
	void display() {
		System.out.println(item);
	}
	public void displayitem() {
		// TODO Auto-generated method stub
		
	}
	
}
class laptop extends Item{
	String type ="HP";
	void displayLaptop() {
		System.out.println(type);
	}
}
class Hp extends laptop{
	String model = "KDzA";
	void displayHp() {
		System.out.println(model);
	
	
}

public class MultiInheritance {

	public static void main(String[] args) {
		
		
		Hp ob=new Hp();
		ob.display();
		ob.displayHp();
		ob.displayLaptop();
		
		
		
		
	}
		// TODO Auto-generated method stub

	}

}
