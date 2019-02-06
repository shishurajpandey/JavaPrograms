package package1;

public class TestUnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 try{  
		      int a[]=new int[5];  
		      
		      a[2]=30/0;  
	   }catch(ArithmeticException e) {
		   e.printStackTrace();
		   System.out.println("common task completed");
		}  
	      System.out.println("rest of the code...");  
	}

}
