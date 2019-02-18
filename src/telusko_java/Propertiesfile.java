package telusko_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileOutputStream fos=new FileOutputStream("data.properties");
		prop.setProperty("url", "Mon11");
		prop.setProperty("platform", "Window");
		prop.setProperty("browser", "Chrome");
		prop.store(fos, null);
		
		FileInputStream fis=new FileInputStream("data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("platform"));
		System.out.println(prop.getProperty("browser"));

	}

}
