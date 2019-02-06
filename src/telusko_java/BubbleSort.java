package telusko_java;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//Integer [] a=new Integer[7];
		int a[] = {64, 34, 25, 12, 22, 11, 90};
		
		for(int i=0;i<a.length-1;i++)
			{
			for(int j=0;j<a.length-i-1;j++)			
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
	}
		System.out.println(Arrays.toString(a));

}

}