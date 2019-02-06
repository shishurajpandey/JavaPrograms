package telusko_june_2018;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		double a=sc.nextDouble();
		System.out.println("Enter Second number");
		double b=sc.nextDouble();
		boolean retry=true;
		double result=0;
		
		
			System.out.println("Enter your operator");
			String x=sc.next();
		
		switch(x) {
		  
		case "+":
			result=a+b;
			break;
		case "-":
			result=Math.abs(a-b);
			break;
		case "/":
			result=a/b;
			break;
		case "*":
			result=a*b;
		default:
			System.out.println("Please enter correct operator");
	
		}
		
			
			System.out.println(result);
		}

	} 
