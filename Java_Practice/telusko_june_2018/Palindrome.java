package telusko_june_2018;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your Number");
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        int sum=0;
        while(x>0) {
        	int num=x%10;
        	x=x/10;
        	sum=sum*10+num;
        }
     
        System.out.println(sum);
        if(temp==sum) {
        	System.out.println("Palindrome");
        }
        else
        	System.out.println("Not Palindrome");
	}

}
