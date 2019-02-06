package package1;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For Loop
		System.out.println("For Loop");
		for(int i = 0;i<= 10;i++){
			
			System.out.println(i);
		}
		
		// While Loop
		System.out.println("While Loop");
		int j = 10;
		while(j>=0){
			System.out.println(j);
			j--;
		}
		
		// Do while loop
		System.out.println("Do While loop");
		int k = 10;
		do{
			System.out.println("k");
			k--;
		}while(k >= 0);
		
		// Break 
        for(int i = 0;i<= 10;i++){
		  System.out.println(i);
		  if(i == 5){
			  break;
		  }
		}
        
       // Continue 
       for(int i = 0;i<= 10;i++){
  	    if(i == 5){
  			  continue;
  		  }
  		 System.out.println(i);
  		}
        
	}

}
