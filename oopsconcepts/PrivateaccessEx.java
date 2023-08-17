package oopsconcepts;
class Privatedemo{
    int b = 1;
    void display() {
		System.out.println("b: "+b);
	}
}

public class PrivateaccessEx {
	private int a;

	public static void main(String[] args) {
		Privatedemo d = new Privatedemo();
		System.out.println("Value of b:" +d.b);
		
		d.display();
		PrivateaccessEx p = new PrivateaccessEx();
		p.a=10;
		System.out.println(p.a);
		// TODO Auto-generated method stub

	}

}
