package package1;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String args[]){  
		  // Allows unique values
		  //A HashSet is an unsorted, unordered Set
		  
		  HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  

		  for(String s : al){  
		   System.out.println(s);  
		  }  
		  
		  
		  System.out.println(al.contains("Vijay") + "  " + al.contains("ABC") );
          al.remove("Vijay");
          System.out.println("############ Remove Vijay ############### ");
          for(String s : al){
			  System.out.println(s);
		  }
          
        
  }  
}
