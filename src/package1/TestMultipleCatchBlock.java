package package1;

public class TestMultipleCatchBlock {
	
	public static void main(String args[]){  
		   try{  
		      int a[]=new int[5];  
		      a[6]=30/5;  
		   } 
//		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
//		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
//		   catch(Exception e){System.out.println("common task completed");} 
		   finally{
			   System.out.println("Finally Block");
    	   }
		   System.out.println("rest of the code...");  
		 }  

}
