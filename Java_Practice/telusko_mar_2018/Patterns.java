package telusko_mar_2018;

public class Patterns {

	public static void main(String[] args) {
		
		simple_Pattern();
		DownSidePattern();
		UpSidePattern();
		OutsidePatterns();
		printNumPattern();
		printBinaryPattern();
		printContinousNumberPattern();

	}
	
	public static void simple_Pattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void DownSidePattern()
	{

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public static void UpSidePattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void OutsidePatterns()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0 || i==3 || j==3 || j==0)
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Printing 
	 * 1234
	 * 2341
	 * 3412
	 * 4123
	 * 
	 * 
	 */
	
	public static void printNumPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				System.out.print(k-4+" ");
				else
				System.out.print(k+" ");
			}
			System.out.println();
		}
}
	public static void printBinaryPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				System.out.print(1+" ");
				else
				System.out.print(0+" ");
			}
			System.out.println();
		}
}
	
	public static void printContinousNumberPattern()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				
			}
			k++;
			System.out.println();
		}
}
}

