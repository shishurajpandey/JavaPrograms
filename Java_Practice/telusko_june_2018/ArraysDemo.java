package telusko_june_2018;

public class ArraysDemo {
	
	public static void main(String [] args) {
		
		int [] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int [] b= new int[5];
		
        for(int i=0;i<b.length;i++) {
        	b[i]=i;
        }
        
        System.out.println("***********************");
        for(int y:b) {
        	System.out.println(y);
        }
        
        int [][]c=new int[3][5];
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<5;j++) {
        		c[i][j]=j;
        	}
        }
        System.out.println("***********************");
        for(int [] m:c) {
        
        	for(int l:m) {
        		System.out.print(l+" ");
        	}
        	System.out.println();
        }
        
        
	}

}
