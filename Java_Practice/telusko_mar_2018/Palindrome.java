package telusko_mar_2018;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Palindrome means 323 is 323 --> 121-121
		
		System.out.println("Enter Your Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original_num=n;
		int sum=0, r=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(original_num==sum)
         System.out.println("Given Number is palindrome");
		else 
			System.out.println("Not Palindrome");
	}

}
