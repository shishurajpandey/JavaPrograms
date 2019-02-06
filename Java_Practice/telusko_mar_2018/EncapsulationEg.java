package telusko_mar_2018;

class Abc{
	
	int x;
	int y;
	private int z;
	private int w;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	
}

public class EncapsulationEg {

	public static void main(String[] args) {
		
		Abc abc=new Abc();
		abc.x=5;
		abc.y=7;
		System.out.println(abc.x);
		System.out.println(abc.y);
		abc.setW(9);
        abc.setZ(10);
        System.out.println(abc.getW());
        System.out.println(abc.getZ());
	}

}
