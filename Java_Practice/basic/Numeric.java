package basic;

public class Numeric {

	public static void main(String[] args) {		
	
	String a="alajbbh1233$$&_";
	String b="";	
	b=a.replaceAll("[a-zA-Z]", "");
    String c=a.replaceAll("[^a-zA-Z]","");
	System.out.println(b);	
	System.out.println(c);
}

}
