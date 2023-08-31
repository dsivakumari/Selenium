package screenshort;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Capturescreenshorttest  extends Maintest {
	
	@Test
	public void captureScreenshort () {
		System.setProperty("webdriver.firefox.marionette", "D:\\drivers\\geckodriver-0.10.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://automationtesting.in/");
		
		String title = driver.getTitle();
		
	    Assert.assertEquals("Home - Automation Test",title);
	    driver.close();
	    
		
	}
	

}
