package telusko_june_2018;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=1;
	    int b=1;
	    System.out.println("Enter your number upto which fibonnaci series required");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=0;
	    System.out.print("1 1 ");
	    while(x<=n)
	    {
	    	x=a+b;
	    if(x>n)
	    	break;
	    else {
	    System.out.print(x+ " ");
	    a=b;
	    b=x;
	    }
	    }

	}

}
