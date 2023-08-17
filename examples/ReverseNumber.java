package examples;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,digit,reverse=0;//assign value to number
		n=345;
		while(n!=0) {  //check number should not equal to 0
			digit=n%10; //take a last digit of the given number
			reverse=reverse*10+digit; //reverse it
			n=n/10;
					
		}
		System.out.println(reverse);
			
		// TODO Auto-generated method stub

	}

}
