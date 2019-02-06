package telusko_june_2018;

public class SuperKeyword {

	public static void main(String[] args) {
     mbn mb=new mbn();
     mb.sum1();
	}
	
	
	}
	
	class mbv{
		
		
		public int a=5;
		public void sum() {
			System.out.println(a);
		}
		
	}
	
	class mbn extends mbv{
		
		public int b=7;
		
		public void sum1() {
			super.sum();
			System.out.println(super.a);
		}
	}

