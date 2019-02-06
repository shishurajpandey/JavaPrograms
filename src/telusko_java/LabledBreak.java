package telusko_java;

public class LabledBreak {

	public static void main(String[] args) {
		
		labledBreak:
		for(int i=0;i<5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(i==3)
					break labledBreak; //unlabled break
				System.out.print("*");
			}
			System.out.println();
		}
			

	}

}
