package telusko_june_2018;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

System.out.println("+++++++++++++++++++++++++++++++++++");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	System.out.println("+++++++++++++++++++++++++++++++++++");
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1 || i==5 || j==1 || j==5)
				{System.out.print("*");
				}
			else{
				System.out.print(" ");
			}
			
		}
		System.out.println();
		
	}
	
	
}
}