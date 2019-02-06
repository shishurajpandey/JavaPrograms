
package interviewQuestions;

import java.util.Scanner;

public class PrintFibonnaciSeries {

	public static void main(String[] args) {
		
		
		int a=1,b=1, k=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print("1 1 ");
		
		while(n>0)
		{
			k=a+b;
			if(k>n)
				break;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		
		
	}

}
