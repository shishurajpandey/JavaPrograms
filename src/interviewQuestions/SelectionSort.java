package interviewQuestions;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int [] a= {1,2,3,4,5,6,7,3,5,7,8,5,78,3};
		
		int i, j, temp;
	    int key;
		
		for(i=1;i<a.length;i++)
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

		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
