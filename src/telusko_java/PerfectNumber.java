package telusko_java;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

//Perfect Number-Sum of all divisor is equal to number- 28- 1+2+4+7+14=28
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int sum=0,r=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
if(sum==n)
	System.out.println("Perfect Number");
else
	System.out.println("Not a Perfect Number");
}

}