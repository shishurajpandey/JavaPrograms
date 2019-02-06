package telusko_june_2018;

public class Inheritence {

	public static void main(String[] args) {
		
		mul1 m=new mul1();
		System.out.println(m.sum(5, 6));
		System.out.println(m.sub(9, 4));
		System.out.println(m.mul(4, 5));

	}

}

class sum1{
	
	public sum1() {
		System.out.println("In const of sum1");
	}
	public int a=5;
	int b=3;
	public int sum(int a, int b) {
		return a+b;
	}
}

class sub1 extends sum1
{
	public sub1() {
	
		System.out.println("In const of SUB1");
	}
	public sub1(int i) {
		
	}
	public int sub(int a, int b) {
		return Math.abs(a-b);
	}

}

class mul1 extends sub1{
	
	public mul1() {
		super(1);
		System.out.println("In const of MUL1");
	}
	
	public int mul(int a, int b) {
		return Math.abs(a*b);
	}
}