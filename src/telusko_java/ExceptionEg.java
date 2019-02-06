package telusko_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionEg {

	public static void main(String[] args) throws Exception {


		int i=8;
		int j=1;
		int k=0;

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
			k=i/j;
		 if(k<10) {
		//	 throw new MyException("Throwing User defined Exception");
			 
		 }
		}
		
		finally {
			System.out.println("Finally Bye");
		}
		
System.out.println("Hello World");
}
}
class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
	
}
