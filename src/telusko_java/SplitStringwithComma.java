package telusko_java;

public class SplitStringwithComma {

	public static void main(String[] args) {
		String str="ab,cd,ef,gh,ij,kl";
		String [] split= str.split(",",3);
		System.out.println(split.length);
		for(String st:split)
		{
			System.out.println(st);
		}
		
		String s="Hello";
		System.out.println(s.substring(3));
	}

}
