package package1;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1 = new String("TechM");
      
 
      String s2 = new String("TechM");
      System.out.println(s2.hashCode());
     System.out.println(s1.hashCode());
     System.out.println(Integer.toHexString(s1.hashCode()));
     System.out.println(Integer.toHexString(s2.hashCode()));
    
	}

}
