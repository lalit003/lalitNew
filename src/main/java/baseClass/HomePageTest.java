package baseClass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{

	
		@BeforeMethod
		public void openbrowser(){
			selectAndStartBrowser();
		}
		
		@Test
		public void homePagetest(){
			Assert.assertEquals(driver.getTitle(), "Google");
		}
		
		
		@AfterMethod
		public void closebrowser(){
			driver.quit();
			
		}
	}


