package telusko_mar_2018;

public class InheritenceEg {

	public static void main(String[] args) {
		
		Cx c=new Cx();
		c.x=5;
		c.y=10;
		c.sum();
		System.out.println(c.result);
		c.sub();
		System.out.println(c.result);
		c.Multiply();
		System.out.println(c.result);
					
	}
}
	
	class AX{
		
		int x;
		int y;
		int result=0;
		
		public void sum()
		{
			result=x+y;
		}
		
	}
	
     class BY extends AX{
    	
    	 
    	 public void sub()
    	 {
    		 result=x-y;
    	 }
     }
     
     class Cx extends BY
         {
    	 
    	 public void Multiply()
    	 {
    		 result=x*y;
    	 }
    	 
     }



