package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNoOfCharactersinString {

	public static void main(String[] args) {
	
		
		String str="Hello How are you Mr.Shishu Raj";
		
		str=str.replaceAll("[\\s.]", "");
		
		char [] a=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char x:a)
		{
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else 
				map.put(x, 1);	
	    }
		
		Set<Character> Charset = map.keySet();
		
		for(char y: Charset)
		{
			
			//print all the elements
		//	System.out.println(y+"------>"+map.get(y));
			
			//To print only distinct elements
		//	if(map.get(y)==1)
		//	System.out.println(y+"------>"+map.get(y));			
			
			//To print duplicate elements
			if(map.get(y)>1)
			    System.out.println(y+"------>"+map.get(y));			

		}
		

		
	}
}