package oopsconcepts;
class Demo{
 int c=2;
 Demo(int a) {
	c=a;
}
void display() {
	int b=20;
	System.out.println(c);
}

}

public class PrivateEx {
	private int a;
	private int b=1;
	
	public void test() {
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		PrivateEx p=new PrivateEx();
		Demo d=new Demo(10);
		d.display();
		System.out.println(d.c);
		}
		// TODO Auto-generated method stub

	}

