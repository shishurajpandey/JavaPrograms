package interviewQuestions;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		
		
		int [] a= {1,2,3,45,5,1234,678976,789654};
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
				largest=a[i];
				else if(a[i]<smallest)
					smallest=a[i];
			
		}
		
		System.out.println("Smallest is : "+ smallest);
		System.out.println("Largest is: "+ largest);
		

	}

}
