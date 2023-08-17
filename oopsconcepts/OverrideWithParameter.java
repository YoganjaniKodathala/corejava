package oopsconcepts;
class UserInput{
	public void data(int a, int b) {
		System.out.println(a+" "+b);
	}
}
class UserAddition extends UserInput{
	public void data(int a, int b) {
		System.out.println("sum"+" "+b);
	}
}

public class OverrideWithParameter {
	public static void main(String[] args) {
		UserInput u=new UserAddition();
		u.data(3,7);
		UserInput us=new UserInput();
		us.data(5, 8);
	
		// TODO Auto-generated method stub

	}

}
