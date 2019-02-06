package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "location");
		WebDriver driver=new ChromeDriver();
		ChromeOptions op=new ChromeOptions();
	//	op.set
		driver.get("https://www.g.com");
        	
		
		
	
	}

}
