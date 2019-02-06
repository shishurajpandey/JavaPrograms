package telusko_june_2018;

import java.util.Scanner;

public class IfElse{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
	
		//int a=5;
		//int b=7;
		//int c=30;
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}else if(b>c) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
		
		
	}
	
	
}
