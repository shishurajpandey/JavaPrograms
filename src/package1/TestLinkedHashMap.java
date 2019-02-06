package package1;

import java.util.LinkedHashMap;
import java.util.Set;

public class TestLinkedHashMap {

	
	 public static void main(String args[]){  
		  
		 //It is same as HashMap instead maintains insertion order.
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  Set<Integer> keys = hm.keySet();
          for(Integer i : keys ){
			  System.out.println("For Key " + i + " Value is " + hm.get(i));
		  }
	 }
}
