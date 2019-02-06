package telusko_mar_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDefinedException {

	public static void main(String[] args) throws IOException, LessNumberException { //We are using throws keyword to postpone the exception handling
//If you don't want to handle any exception then you can use throws keyword		
		int x=1;
		
		try{
			if(x<5)
			//We use throw keyword to invoke the exception Explicitly
				throw new ArithmeticException();
		}
			catch(ArithmeticException a) {
			System.out.println(a);	
			}

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	br.readLine();
	
	int y=7;
		try {
			if(y<5)
		
		{
			throw new LessNumberException("exception");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
//You can also create user defined exception.
	//If you want to create checked exception then create a class extending Exception
	//For uncheck exception, create a class extending RuntimeException
	}

class LessNumberException extends Exception{
	
	public LessNumberException(String e)
	{
		super(e);
	}
	
	
}