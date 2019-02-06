package basic;

import interviewQuestions.BubbleSort;

public class InterviewRough {

	public static void main(String[] args) {
	
	//	insertionSort();
		
        SelectionSort();
		//bubbleSort();
	}

	
	public static void insertionSort()
	{
		int a[]= {1,5,7,4,2,9};
		int temp=0;
		
		int key=0, j=0;
	
		for(int i=1;i<a.length;i++)
		{
		    key=a[i];
		    j=i-1;
		    while(j>=0 && a[j]>key)
		    {
		    	temp=a[j];
		    	a[j]=a[j+1];
		    	a[j+1]=temp;
		    	
		    	j--;
		    }
		}
		for(int x:a)
		System.out.println(x);
		
	}
	
	
	public static void bubbleSort()
	{
		int temp=0;
		
		int a[]= {1,5,7,4,2,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(int x:a)
			System.out.println(x);
	}
	
	public static void SelectionSort()
	{
		int temp=0,minValue=0,minIndex=0;
		
		int a[]= {1,5,7,4,2,9};
		
		for(int i=0;i<a.length;i++)
		{
			minIndex=i;
			minValue=a[i];
			
			for(int j=i;j<a.length;j++)
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
		for(int x:a)
			System.out.println(x);
}
	
	
}

