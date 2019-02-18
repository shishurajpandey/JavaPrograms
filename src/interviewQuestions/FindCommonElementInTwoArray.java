package interviewQuestions;

public class FindCommonElementInTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {2,4,6,8,0,10,12,14,16};
		int x[];
		
		//To find the common element we will compare two array one by one

		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
				
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
		

	}

}
