package baseClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	
	public BaseClass(){
		
/*		try{
		fis = new FileInputStream("C:\\Users\\lmohan\\Desktop\\Work Related\\qa\\src\\main\\java\\config.properties");
		prop = new Properties();
		prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
		e.printStackTrace();

		}
*/
	}
	
	public void selectAndStartBrowser(){
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\lmohan\\Desktop\\Work Related\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
	

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	}

	
}
