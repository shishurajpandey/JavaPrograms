package interviewQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		
		int x=6;
		int y=21;
		
		//Method 1 using temporary Variable
		
		int temp=x;
		
		x=y;
		y=temp;
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		//Method 2 using Plus minus operator
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		//Method 3 usig multiply and divide
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
		//Method 4 Using XOR Operator
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
	}

}
