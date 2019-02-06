package interviewQuestions;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
	
     
		isAnagram("hello","ohell");
		isAnagram("Mother In Law", "Hitler Woman");
		 isAnagram("Mother In Law", "Hitler Woman");
		 
	        isAnagram("keEp", "peeK");
	 
	        isAnagram("SiLeNt CAT", "LisTen AcT");
	 
	        isAnagram("Debit Card", "Bad Credit");
	 
	        isAnagram("School MASTER", "The ClassROOM");
	 
	        isAnagram("DORMITORY", "Dirty Room");
	 
	        isAnagram("ASTRONOMERS", "NO MORE STARS");
	 
	        isAnagram("Toss", "Shot");
	 
	        isAnagram("joy", "enjoy");
	}

	
	public static void isAnagram(String x, String y)
	{
		char[] x1=(x.replaceAll("[^a-zA-Z]","")).toLowerCase().toCharArray();
		char[] x2=(y.replaceAll("[^a-zA-Z]","")).toLowerCase().toCharArray();	
		Arrays.sort(x1);
		Arrays.sort(x2);
		
		if(Arrays.equals(x1, x2))
		//if(String.valueOf(x1).contentEquals(String.valueOf(x2)))  
		{
			
			System.out.println("Is Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
				
	}
}
