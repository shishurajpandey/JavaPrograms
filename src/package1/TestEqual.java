package package1;

class Equal{
	int num;
	
	public Equal(int i){
		num=i;
	}
	
	public int getNum(){
		return num;
	}
	
	public boolean equals(Object o){
		
		if((o instanceof Equal) && (((Equal)o).getNum() == this.num)){
			return true;
		}else{
			return false;
		}
    }
	
	public String toString(){
		
		return String.valueOf(num);
		
	}
}
public class TestEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = new String("Java");
//		String s2 = new String("Java");
		
//		String s1 = "Java";
//		String s2 = "Java";
//		
//		System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
        
        Equal e1 = new Equal(5);
        Equal e2 = new Equal(5);
//        
//
		System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
  //      System.out.println(e1);
	}

}
