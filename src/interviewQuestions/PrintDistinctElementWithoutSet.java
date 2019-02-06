package interviewQuestions;

public class PrintDistinctElementWithoutSet {

	public static void main(String[] args) {

		int [] a= {1,2,3,4,3,4,5,6,7,4,35,6,7,7,5,43,2};
				
		
		for(int i=0;i<a.length;i++)
		{
			boolean isDistinct=true;

			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
		        isDistinct=false;	
			}
			
			if(isDistinct)
				System.out.print(a[i]+",");
		}
	}

}

