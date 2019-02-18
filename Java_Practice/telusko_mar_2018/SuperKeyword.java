package telusko_mar_2018;

public class SuperKeyword {

	public static void main(String[] args) {
		

	}

	
	class ad{
		int x=5;
		public void sum()
		{
			System.out.println("In Ad");
		}
		public ad(int y)
		{
			System.out.println("In Ad");
		}
		
	}
	
	class ae extends ad{
		
		@Override
		public void sum()
		{   super.sum(); //with  the help of super you are calling method of parent class.
			System.out.println("in ae");
			System.out.println(super.x); ////with  the help of super you are calling variable of parent class.
		}
		
		public ae(int z)
		{  
			super(z); //We are calling the parametrized consturctor using the super() method
			System.out.println("In Ad");
		}
	}
}
