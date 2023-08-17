package oopsconcepts;
class Learner{
	public void lname() {
		System.out.println("My name is Anjali");
	}
	
	void courseName()
	{
		System.out.println("Java full Stack");
		}
	}
class Lcourse extends Learner{
protected void courseName()//can not reduce the visibility of inherited method in child class
	{
		super.courseName();
		System.out.println("data analytics");
		}
}

public class MethodOverridingClass {

	public static void main(String[] args) {
Lcourse l=new Lcourse();
l.courseName();
l.lname();
//Learner le=new Learner();
//le.courseName();
//le.lname();
}

}


