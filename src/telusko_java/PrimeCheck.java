package telusko_java;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(num);i++) //for(int i=2;i<n<i++) //for(int i=2;i<=n/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println("This is a Prime Number");
		else
			System.out.println("This is not a prime number");

	}

}
