package interviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int r, rev=0;
		
		while(x>0)
		{
			r=x%10;
			x=x/10;
			rev=rev*10+r;
			
		}
		
		System.out.println(rev);
		
		
	}
	
	

}
