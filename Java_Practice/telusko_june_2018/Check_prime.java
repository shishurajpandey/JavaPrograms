package telusko_june_2018;

public class Check_prime {

	public static void main(String[] args) {
		int num=29;
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
