package telusko_june_2018;

public class PolyMorphism {

	public static void main(String[] args) {
		
		
		cd h=new cd();
		h.sum(4, 5); //calling the overrided method
		h.sum(3, 4, 0); //overrided method from base class
		h.sum(3, 4, 5.0f); //calling the method from base class

	}
}

	
	
	class mb{
		
		//Method Overloading
		public void sum(int a, int b) {
			System.out.println(a+b);
		}
        public void sum(int a, int b, int c) {
			System.out.println(a+b+c);
		}
        
        public void sum(int a, int b,  float c) {
			System.out.println(a+b+c);
		}
	}
	
	class cd extends mb{
		
		///Method overriding
		public void sum(int a, int b) {
			System.out.println(a*b);
		}
        public void sum(int a, int b, int c) {
			System.out.println(a+b*c);
		}
	
	}
