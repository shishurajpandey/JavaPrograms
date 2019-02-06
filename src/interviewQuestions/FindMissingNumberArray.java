package interviewQuestions;

public class FindMissingNumberArray {

	public static void main(String[] args) {
		//How to find a duplicate number in a sorted sequence of Array
		//original Array int a[]={1,2,3,4,5,6,7,8,9}
        //Missed Array  int b[]={1,2,3,4,6,7,8,9}   - Here 5 is missing,
		//Question is how to find the missing array.
		int a[]={1,2,3,4,5,6,7,8,9};
		int b[]={1,2,3,4,6,7,8,9};
		//Add all the number in original Array
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		}
		
		int sum1 = 0;
		for(int j=1;j<b.length;j++)
			
		{
			sum1=sum1+b[j];
		}
		
		System.out.println("Missing Number is " + (sum-sum1));
		
		//If original array was just a sequence of array in asscending order, we can just add all those number 
		//suppose we have a sequence of number from 0 to 9
		int sum2=0;
		
		for(int k=1;k<=9;k++)
		{
			sum2=sum2+k;
		}
		
		System.out.println("Missing Number is " + (sum2-sum1));

	}

}
