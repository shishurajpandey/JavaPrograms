package telusko_mar_2018;

public class ExceptionEg {

	public static void main(String[] args) {
	
		//Exception: Exception is an event which can abrupt the normal flow of program.
		/*
		 * Throwable- 1. Exception- Checked Exception- Checked exception is a exception which needs occurs at compile time and need to handle 
		 *                          that while writing. You can't go ahead without handling checked exception
		 *                          EG- SQLException, IOException
		 *                          Unchecked Exception- Unchecked exception is a exception which occurs during runtime.
		 *                          Eg- Runtime Exception
		 *                          - ArithmeticException
		 *                          -DivideByZeroException
		 * 
		 *            2. Error- You can't handle your error it will cause your program to abrupt.
		 *            
		 * 
		 * throws is a keyword which is used to supress the exception.
		 */
		
		int x=5;
		int y=0;
		String m="Hello";
		
		try {
			int z=x/y;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//finally block will be exceuted everytime, Doesn't matter what is happening. Mainly used to close all the resources.
		finally {
			System.out.println("I am in finally block");
		}
	}

}
