package interviewQuestions;

public class DistinctElement {

	//Print Unique elements--->
	
	public static void main(String[] args) {
		int [] arr={1,2,3,3,4,5,6,7,7,8,9};
		
		for(int i=0;i<arr.length;i++)
		{ 
			
		boolean isDistinct=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{		isDistinct=false;
				        break;
				}
				
			}
			
			if(isDistinct )
			{   if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
			}
	}

}
}
