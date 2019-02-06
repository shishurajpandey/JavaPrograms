package telusko_june_2018;

public class LablledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normal break will break the inner loop or nearest loop from the break statments
		//Lablled break will break the lablled loop which contains break statments
		
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) {
				System.out.print("*");
				break;
			}
		}

		System.out.println();
		label:
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) {
				System.out.print("*");
				break label;
			}
		}
	}

}
