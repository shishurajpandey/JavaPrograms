package telusko_june_2018;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//153- 1*1*1 + 5*5*5 + 3*3*3 =1+27+125=153
		
		
		int num=1593;
	
        int sum=0;
        int temp=num;
        while(num>0) {
        	int r=num%10;
        	sum=sum+r*r*r;
        	num=num/10;
        }

        if(sum==temp) {
        	System.out.println("Armstrong");
        }
        else {
        	System.out.println("Not Armstrong");
        }
	}

}
