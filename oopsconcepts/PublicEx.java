package oopsconcepts;

public class PublicEx {
	public String s = "yoga";
	public void msg() {
		System.out.println("yoga "+s);
	}
	
	public static void main(String[] args) {
		PublicEx p=new PublicEx();
		p.msg();
	}
}
