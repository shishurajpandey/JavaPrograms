package interviewQuestions;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		
		int [] x= {1,2,3,4,4,5,6,6,1,7,7,8,9,9};	
		for(int i=0;i<x.length;i++)
		{
			boolean isRepeat=false;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
                     isRepeat=true;
                     break;
				}
			}
			
			if(!isRepeat)
			{
				System.out.print(x[i]+ " ");

			}
		}

	}

}
