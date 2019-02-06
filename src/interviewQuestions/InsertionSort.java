package interviewQuestions;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {


		int [] a= {9,8,7,5,4,3};


		//insertionSort(a);
	//	selectionSort(a);
		bubbleSort(a);
		//Arrays.sort(a);

		
		for(int x:a)
			
		{
			System.out.println(x);
		}
	}

	private static void bubbleSort(int[] a) {
	
		int i, j, temp=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
	}

	private static int[] selectionSort(int[] a) {
		int i, j, minValue, minIndex, temp=0;
		for(i=0;i<a.length;i++) {
			minValue=a[i];
			minIndex=i;

			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<minValue)
				{
					minValue=a[j];
					minIndex=j;
				}
			}
			if(minValue<a[i])
			{

				temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;

			}
		}
		return a;
	}

	private static int[] insertionSort(int[] a) {
		int key=0; int j=0, temp=0;

		for(int i=1;i<a.length;i++)
		{			
			key=a[i];
			j=i-1;

			while(j>=0 && key<a[j])
			{
				temp=a[j];
				a[j]=a[j+1]; 
				a[j+1]=temp;

				j--;
			}

		}
		return a;
	}

}
