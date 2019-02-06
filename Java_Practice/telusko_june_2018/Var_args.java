package telusko_june_2018;

public class Var_args {

	public static void main(String[] args) {
		
	     show(1,2,3,4);
	}

	public static void show(int ... x) {
		
		for(int i:x) {
			System.out.println(i);
		}
	}

}
