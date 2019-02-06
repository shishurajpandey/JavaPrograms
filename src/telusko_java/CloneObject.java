package telusko_java;

public class CloneObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneAbc abc=new CloneAbc();
		abc.i=1;
		abc.j=5;
		System.out.println(abc.i+" "+abc.j);
		
		CloneAbc abc1=new CloneAbc(); //deep copying
		abc1.i=abc.i;
		abc1.j=abc.j;
		System.out.println(abc1.i+" "+abc1.j);
		
		CloneAbc abc2=abc; //Shallow copy
		System.out.println(abc2.i+" "+abc2.j);
		
		CloneAbc abc3=(CloneAbc) abc.clone();
		System.out.println(abc3.i+" "+abc3.j);
		
	}
	

}

class CloneAbc implements Cloneable{
	
	public int i;
	public int j;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
}
