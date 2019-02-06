package interviewQuestions;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {3,5,6,7,4,36,77,3,642,698};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
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
		{
			System.out.println(x);
		}

	}

}
