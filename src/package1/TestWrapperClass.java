package package1;

public class TestWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 42;
		// Converting Primitive to Object Type
		Integer i1 = new Integer(i);
			
		// using ValueOf method
		Integer i2 = Integer.valueOf(i);
		
		// Converting Object Type to Primitive - Using xxxValue()
		      int j = i2.intValue();
              long l = i2.longValue();
              
         // Converting String to Primitive     
              int k = Integer.parseInt("42");
	}

}
