package telusko_mar_2018;

public class TwoDArrays {

	public static void main(String[] args) {
		//1-D Array
		int a[]=new int[3];
		a[0]=1;
	    a[1]=2;
	    a[2]=3;
		int []b= {1,2,3,4,5,6};
		
		int [] c=new int[10];
		for(int i=0;i<c.length;i++)
		{
			c[i]=i;
		}
		
		//Enhanced For Loop
		for(int d:c)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		//2D Array
		int [][] x=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=i+j;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int [][] y= {
				     {1,2,3},
				     {4,5,6},
				     {7,8,9}
		            };
		
		
		//Jagged Array-				    
		int [][] z= {
			     {1,2,3},
			     {4,5},
			     {1,2,3,4,5},
			     {7,8,9,3}
	            };
		for(int[] m:z)
		{
			for(int n:m)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println();
		}
	}


