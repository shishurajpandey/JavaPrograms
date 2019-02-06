package telusko_java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	//A number is armstrong if sum of cube of individual digit is equal to numbers.
		//371= 3*3*3+7*7*7+1*1*1=371
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Number");
	int n=sc.nextInt();
	sc.nextLine();
	int sum=0,r=0;
	int t=n;
	
while(n>0)	
{
	r=n%10;
    n=n/10;
    sum=sum+r*r*r;
}
if(sum==t)
	System.out.println("Armstrong Number");
else
	System.out.println("Not Armstrong Number");
}
	
}
