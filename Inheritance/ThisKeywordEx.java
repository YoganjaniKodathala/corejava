package Inheritance;

public class ThisKeywordEx {
	int a,b,c;
	public void setdata(int a, int b, int c1) {
		this.a=a;
		this.b=b;
		c=c1;
	}
	public void displaydata() {
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		System.out.println("Value of c :"+c);
	}

	public static void main(String[] args) {
		ThisKeywordEx e = new ThisKeywordEx();
		e.setdata(10,10,20);
		e.displaydata();
		// TODO Auto-generated method stub

	}

}
