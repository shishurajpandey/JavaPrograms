package interviewQuestions;

public class ReplaceJunkCharacters {

	public static void main(String[] args) {
	   
		String s="#$%#%!@$#$$ Selenium Java $#%#%%$ API";
        
		s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(s.trim());
	
		// trim() will remove extra space from back and front
	//	\\s for space
		
	}

}
