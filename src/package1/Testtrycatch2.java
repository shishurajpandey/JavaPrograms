package package1;

public class Testtrycatch2 {
	
	public static void main(String args[]){  
		int data;
		
	//	data = 50 / 0;
		
		   try{  
		     data=50/0;  
		   }catch(ArithmeticException e){
			  e.printStackTrace();
		   } finally{
			   System.out.println("Finally Block");
		   }
		   System.out.println(" rest of the code...");  
		}  
}
