package interviewQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int [] bin=new int[1000];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(n>0)	
		{
			bin[i]=n%2;
			n=n/2;
			i++;
		}

		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
		}
	}

}
