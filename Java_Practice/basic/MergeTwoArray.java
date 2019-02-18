package basic;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		
		int aLength=a.length;
		int bLength=b.length;
		
		int clength=a.length+b.length;
		
		int c []=new int[clength];
		
		
		
		for(int i=0;i<c.length-b.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=a.length-1;j<c.length;j++)
		{
			int k=0;
			c[j]=b[k];
			k++;
		}	
	}
}
