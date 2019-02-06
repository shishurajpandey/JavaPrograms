package telusko_java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Palindrome-101- 101
		//Not Palndrome- 123---321
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int sum=0, r=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
	
		if(sum==t)
		{
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}

}
