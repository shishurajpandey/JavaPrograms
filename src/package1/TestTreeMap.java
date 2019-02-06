package package1;

import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
	
	public static void main(String args[]){  
		  // Sorted 
		  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  Set<Integer> keys = hm.keySet();
          for(Integer i : keys ){
			  System.out.println("For Key " + i + " Value is " + hm.get(i));
		  }
   }  
}
