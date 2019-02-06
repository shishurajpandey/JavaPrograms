package telusko_mar_2018;

import java.util.Scanner;

public class FibonnaciNumber {

	public static void main(String[] args) {
		
		// Fibonacci series is like- 1 1 2 3 5 8 13 21...

		int a =1, b=1;
		int k=0;
		//System.out.print(a+" "+b+" ");
		System.out.println("Enter the number upto which you want to Print");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		//while(k<50)
		while(k<n)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		
		
	}

}
