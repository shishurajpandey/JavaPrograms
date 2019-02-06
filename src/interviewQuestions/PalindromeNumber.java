package interviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {
		public static void main(String[] args) {
		
			
			Scanner sc=new Scanner(System.in);
			
			int x=sc.nextInt();
	     	int temp=x;
			int r, rev=0;
			
			while(x>0)
			{
				
				r=x%10;
				x=x/10;
				rev=rev*10+r;
				
			}
			if(temp==rev)
			System.out.println("Palindrome");
			else {
				System.out.println("Not a Palindrome");
			}
			
			
		}
		
	


}
