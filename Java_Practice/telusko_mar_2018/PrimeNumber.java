package telusko_mar_2018;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.printf("Given number %d is prime number",n);
		else
			System.out.println("Not Prime");
	}

}
