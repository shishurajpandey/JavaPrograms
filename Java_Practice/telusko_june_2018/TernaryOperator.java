package telusko_june_2018;

public class TernaryOperator {
	
	public static void main(String [] args) {
		
		int a=5;
		int b=6;
		int c=7;
		
		int max= a>b && a>c?a:b>c?b:c;
		System.out.printf("Highest number is %d",max);
		
	}

}
