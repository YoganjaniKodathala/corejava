package examples;
//2 3 5 7 11........97

import java.util.Scanner;

public class GeneratePrime {

	public static void main(String[] args) {
		int num,c=0;
		Scanner scanner =new Scanner(System.in);
		
		
		
		for( num=1;num<=100;num++) {
			c=0;
		}
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				//System.out.println(i);
				c++;
			}
		}
		if(c==2) {
			System.out.println(num);
		}
	}

}
