package telusko_june_2018;

public class Patterns2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

		 * 
		 */
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	/*
	 * 
	 * 
	 1,2,3,4
	 2,3,4,1
	 3,4,1,2
	 4,3,2,1
	 
	 */
	System.out.println("********************************************");
	
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
					System.out.print(k-4 +" ");
				else
					System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
