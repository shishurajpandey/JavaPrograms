package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountChars {

	public static void main(String[] args) {
		String str="shishurajpandey";
		count(str);

	}

	private static  void count(String str) {
		char[] arr = str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char a:arr)
		{
			if(map.containsKey(a))
			{
				map.put(a, map.get(a)+1);
			}
			else
				map.put(a, 1);
		}
		
		Set<Character> chars = map.keySet();
		
		for(char b:chars)
		System.out.println(b+"--->"+map.get(b));
		
	}

}
