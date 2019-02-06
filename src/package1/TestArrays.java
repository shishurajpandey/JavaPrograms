package package1;


public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		
		num[0]= 23;
		num[1]= 63;
		num[2]= 99;
		num[4]= 100;
		
		
		for(int i = 0;i < num.length;i++){
			System.out.println(num[i]);
		}
		
		// For Each Loop
		for(int i : num){
			System.out.println(i);
		}
		
		String[] name = new String[5];
		name[0] = "Pune";
		name[1] = "Mumbai";
		
		for(String s : name){
			System.out.println(s);
		}

	}

}
