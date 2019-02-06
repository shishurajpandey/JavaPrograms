package telusko_mar_2018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		
		
	/*	Properties prop=new Properties();
		FileOutputStream fos=new FileOutputStream("config.properties");
		prop.setProperty("url", "https://www.offcampusjobs4u.com");
		prop.setProperty("username", "raj007champ");
		prop.setProperty("password", "novera");
		prop.store(fos, null);*/
	
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		
	}

}
