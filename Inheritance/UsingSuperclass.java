package Inheritance;

class A{
		int age=40;
		int rno=1;
	}
class B extends A{
		int age=20;
		void display() {
			System.out.println(age);
			System.out.println(rno);
			System.out.println(super.age);
		}
	}
public class UsingSuperclass {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
		// TODO Auto-generated method stub

	}
