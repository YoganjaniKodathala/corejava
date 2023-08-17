package examples;

public class FibonocciEx{
	public static void main(String[] args) {
		int n1=0,n2=4,n3,count=10,i;
		System.out.println(n1);
		for(i=0;i<=count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
