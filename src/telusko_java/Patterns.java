package telusko_java;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("Full Square");
    for(int i=0;i<5;i++)
	{
    	for(int j=0;j<5;j++)
		
				{System.out.print("*");
		        }
    	System.out.println();
	}
 
	
	System.out.println("Square-1");
    for(int i=0;i<5;i++)
	{
    	for(int j=0;j<5-i;j++)
		
				{System.out.printf("*");
		        }
    	System.out.println();
	}
    
    
    System.out.println("Square-2");
    for(int i=0;i<5;i++)
	{
    	for(int j=0;j<=i;j++)
		
				{System.out.printf("*");
		        }
    	System.out.println();
	}
    }
	

	}

