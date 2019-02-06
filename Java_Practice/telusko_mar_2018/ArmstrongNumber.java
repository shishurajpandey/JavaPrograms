package telusko_mar_2018;

import java.util.Scanner;

public class ArmstrongNumber {

	//Armstrong number is 153- 1*1*1 + 5*5*5+ 3*3*3=153
	
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(n>0) 
		{
			int r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		
		
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not A Armstrong Number");

	}

}
