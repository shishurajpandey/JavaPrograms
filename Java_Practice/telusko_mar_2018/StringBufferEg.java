package telusko_mar_2018;

public class StringBufferEg {

	public static void main(String[] args) {
		
		//String is by Default immutable means once assigned you can't change its value however you can assign different value that refernce but it will create a new object for you
		//StringBuffer is mutable that means you can change the value of that string, you can change, replace, remove any character from the string.
		//StringBuffer is threadSAFE, used for synchronisation
		//StringBuilder is also mutable and it is not thread safe, No gurantee of synchronisation.
	
		StringBuffer bf=new StringBuffer("Hello this is Shishu Raj Pandey");
		System.out.println(bf);
		System.out.println(bf.append("...."));
		System.out.println(bf.deleteCharAt(3));
		System.out.println(bf.replace(15, 20, "Mr"));
		
		
		StringBuilder bd=new StringBuilder("Shishu Raj Pandey");
		System.out.println(bd.append(".."));
		System.out.println(bd.replace(0, 5, "Mr"));
	}

}
