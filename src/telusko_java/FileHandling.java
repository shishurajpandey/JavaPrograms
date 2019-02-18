package telusko_java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		try{
			File f =new File("demo.txt");
		
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Hello World");
		
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
		dos.close();
		dis.close();
		}
		finally
		{
		System.out.println("Hello");	
		
		}
	}

}
