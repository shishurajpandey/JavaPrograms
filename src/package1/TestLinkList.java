package package1;

import java.util.LinkedList;

public class TestLinkList {
	   
	public static void main(String args[]){  
		  // Java LinkedList class uses doubly linked list to store the elements
		 // Slow Iteration and random access
		 // Fast Insertion and deletion 
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  for(String s : al){
			  System.out.println(s);
		  }
		 
	}  
}
