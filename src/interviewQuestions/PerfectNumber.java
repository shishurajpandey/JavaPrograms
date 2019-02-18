package interviewQuestions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//perfect number is equal to sum of divisors
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	    int sum=0;
	    
	    
	    for(int i=1;i<n;i++)	
	    {
	        if(n%i==0)	
	        {
	        	sum=sum+i;
	        }
	    }
	    
        if(n==sum)
	    System.out.println("Perfect Number");
        
        if(n!=sum)
    	System.out.println("Not a Perfect Number");
	}

}