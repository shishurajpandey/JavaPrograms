package package1;

import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	public static void main(String args[]){  
		   
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  Set<Integer> keys = hm.keySet();
		  
		  for(Integer i : keys ){
			  
			  System.out.println("For Key " + i + " Value is " + hm.get(i));
		  }
		  
		 System.out.println(hm.containsKey(100) + "   " + hm.containsValue("BA"));
	 }  
}
