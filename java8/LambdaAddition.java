package java8;

public class LambdaAddition {
	interface Myinterface{
		int add(int a,int b);
		
	}
	interface Myinterface1{
		int mul(int a, int b);
	}
	interface Myinterface11{
		boolean evenodd(int a);
	}

	public static void main(String[] args) {
		Myinterface mf = (int a,int b)->a+b;
		System.out.println("Sum is :...."+mf.add(4, 7));
		Myinterface1 mf1 = (int a, int b)->a*b;
		System.out.println("Mul is :..."+mf1.mul(4, 6));
		
		
				
			
		}
		
		}

