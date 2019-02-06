package telusko_java;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int a=105;
		int b=301;
		System.out.println("Before Swapping");
		System.out.println(a+","+b);
		//Swapping using third variable
		/*int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println(a+","+b);*/
		
		//Swapping without using third variable
		/*a=a+b;
		b=a-b;
	    a=a-b;
	    System.out.println("After Swapping");
		System.out.println(a+","+b);*/
	
	//Swap using XOR Operator
		
		a=a^b;
		b=a^b;
	    a=a^b;
		 System.out.println("After Swapping");
			System.out.println(a+","+b);
			
			//Swap using Easiest way
			
		//	b=a+b-(a=b);
			//System.out.println(a+","+b);
	}

}
