package interviewQuestions;

public class SwapTwoString {

	public static void main(String[] args) {
		 String s="Hello";
		 String z="How Are You";
		 
		s=s+z;
		z=s.substring(0,s.length()-z.length());
		s=s.substring(z.length());
		System.out.println(s);
		System.out.println(z);

	}

}

