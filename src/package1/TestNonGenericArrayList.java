package package1;

import java.util.ArrayList;
import java.util.Iterator;

class A1{
	
}
public class TestNonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int i = 50;
		  ArrayList al=new ArrayList();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add(new Float(3.14));
		  al.add(new A1());
		  
		  
		  
		  
		  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		   
		  
		  }  
		  
		  System.out.println("#################################");
//		  for(String s : al){
//			  System.out.println(s);
//			  
//		  }

	}

}
