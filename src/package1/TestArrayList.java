package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String args[]){  
		   
		
		 // Fast Iteration and random access
		 // Slow Insertion and deletion 
		
		  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		 
		  		  
		  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  System.out.println("#################################");
		  for(String s : al){
			  System.out.println(s);
		  }
		  
		  System.out.println(al.contains("Vijay") + "  " + al.contains("ABC") );
          al.remove("Vijay");
          System.out.println("Remove Vijay");
          for(String s : al){
			  System.out.println(s);
		  }
          
          System.out.println("Element at 2 position" + al.get(2));
	    
	}  
	
}
