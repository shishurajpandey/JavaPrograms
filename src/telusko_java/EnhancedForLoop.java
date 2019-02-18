package telusko_java;

import java.util.Arrays;
import java.util.Collections;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Integer [] a=new Integer[10];
		Arrays.sort(a,Collections.reverseOrder());
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int) (10*Math.random());
		}
		
		for(int j:a)
		{
			System.out.println(j);
		}
System.out.println("hello");
	System.out.println(randomWithRange(5, 3));
	}

	public static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	
}
