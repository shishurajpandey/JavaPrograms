package telusko_june_2018;

import java.util.Scanner;

public class PrintAsciiValue {

	public static void main(String[] args) {
	
	//	Ascii values will vary from 1 to 127
		for (int i=0;i<=127;i++)
		{
			System.out.printf("%d,%c",i,i);
			System.out.println();
		}
	}

}
