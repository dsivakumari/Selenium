package testngs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pujastoreannotation {
	WebDriver driver;
	@BeforeClass
	public void setbroswe() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();// i am going to maximize
		driver.get("http://poojastore.marolix.com/authenticate/Login"); //open the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//i am going to  manage the time

	}
	@Test
	public void homepage() {
		
	}
	
	
	
	
	
	
			
	}


