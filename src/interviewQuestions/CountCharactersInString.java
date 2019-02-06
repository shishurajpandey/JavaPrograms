package interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountCharactersInString {

	private static void CountCharMethod(String enteredString) {
		
		char[] charArray = enteredString.toLowerCase().toCharArray();
		
		Map<Character, Integer> charMap=new LinkedHashMap<>();
		
		for(char c:charArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
				charMap.put(c, 1);
		}
		
		Set<Character> alpha = charMap.keySet();
		
		for(char a:alpha)
		{
			System.out.println(a+"-->"+ charMap.get(a));
		}
		
		
	}

	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String EnteredString=sc.nextLine();
	    CountCharMethod(EnteredString);
		
	}

	
}
