package basic;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class GetFileContents {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\Work\\TechM_WORKSPACE\\JavaProgram\\abc.txt.txt");
		
		DataInputStream ds=new DataInputStream(fis);
		
		String s=ds.readLine();	
		//System.out.println(s);
		s.trim();
		String z=s.replaceAll("[^0-9.]","");
		//
		System.out.println(z);
		
		
		
	}

}
