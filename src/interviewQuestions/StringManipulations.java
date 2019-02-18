package interviewQuestions;

public class StringManipulations {

	public static void main(String[] args) {
	
		
		
		String s="Hello World, I am Shishu Raj Pandey, I am here to take your Interview, Shishu Raj";
		String x="Hello";
		
		System.out.println(s.length());
		System.out.println(s.substring(1, 5));
		
		System.out.println(s.indexOf("Shishu"));
		//this method will give the first occurence of Character of S
		System.out.println(s.indexOf("S"));
        //For second occurence
		System.out.println(s.indexOf("S", s.indexOf("S")+1));
		System.out.println(s.equals(x));
		System.out.println(s.toCharArray());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("Shishu"));
		System.out.println(s.isEmpty());
		System.out.println(s.replace(" ", ""));  //replaces every occurences of space in entire String
		System.out.println(s);
		System.out.println(s.compareToIgnoreCase(x));
		System.out.println(s.startsWith("H"));
		System.out.println(s.trim());  //trim will remove first and last spaces not in bw spaces
		String [] y= s.split(" ");
		for(String d:y)
		{
			System.out.println(d);
		}
	
		
		}

}
