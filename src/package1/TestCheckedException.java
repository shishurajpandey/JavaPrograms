package package1;

import java.io.File;
import java.io.IOException;

public class TestCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\np00346349\\ATT\\Java.txt");
		
		try {
			TestCheckedException.fileHandle(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void fileHandle(File file) throws IOException{
		
		if(file.exists()){
			System.out.println("File exists");
		}else{
		//	try {
				file.createNewFile();
//			} catch (IOException e) {
//				 //TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}

}
