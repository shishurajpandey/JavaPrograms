package telusko_june_2018;

public class PerfectNumber {
	
	public static void main(String [] args) {
		
		int num=28;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
				
		
	}

}
