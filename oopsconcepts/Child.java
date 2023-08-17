package oopsconcepts;
public class Child implements XYZ{
	
	public static void main(String[]args) {
		Child c=new Child();
		c.methodABC();
		c.methodPQR();
		c.methodXYZ();
		
	}
	@Override
	public void methodABC() {
		System.out.println("ABC method");
	}
	@Override
	public void methodPQR() {
		System.out.println("PQR method");
	}
	@Override
	public void methodXYZ() {
		System.out.println("XYZ method");
	}
}
	

