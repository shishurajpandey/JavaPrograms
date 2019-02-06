package telusko_june_2018;

public class Encapsulation {

	public static void main(String[] args) {

		Abc a=new Abc();
		a.empId=101;
		a.EmpName="Ram";
		System.out.println(a.empId + " "+ a.EmpName);
		
		 Bcd b=new Bcd();
	//	b.empId=101;    --Here it will give error because variables are private and can not be acccessible directly and hence 
		 // using getters and setters
	//	b.EmpName="Ram";
		 
		 b.setEmpId(123);
		 b.setEmpName("Shayam");
		System.out.println(b.getEmpId() + " "+ b.EmpName());

	}

}

class Abc{
	public int empId;
	public String EmpName;	
}
class  Bcd{
	private int empId;
	private String EmpName;	
	
	public int getEmpId() {
		return empId;
	}
	public String EmpName() {
		return EmpName;
	}
	
	public void setEmpId(int eid) {
		this.empId=eid;
	}
	public void setEmpName(String eName) {
		this.EmpName=eName;
	}

}