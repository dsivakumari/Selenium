package testngs;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2poojastore {
	WebDriver driver;
		
	@BeforeClass
	public void setbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();// i am going to maximize
		driver.get("http://poojastore.marolix.com/authenticate/Login"); //open the url

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15)); //i am going to  manage the time
			
	}
	
	@Test(priority = 1)
	public void Homepage() {
		
		
		 String url = driver.getCurrentUrl();
		 AssertJUnit.assertEquals("http://poojastore.marolix.com/authenticate/Login", url);
		 
	}
	@Test(priority = 2,dependsOnMethods = "Homepage",invocationCount = 3)
	public void login() {
		
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		 String urlhomepage=driver.getCurrentUrl();
		 AssertJUnit.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", urlhomepage);
		 			
	}
	@Test(priority = 3,dependsOnMethods = "login")
	
	public void logout() throws Throwable {
	 WebElement clicks = driver.findElement(By.xpath("//img[@src='/AdminAssets/dist/img/avatar5.png']"));
	 clicks.click();
	 	  		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
		
		String logouturl=driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://poojastore.marolix.com/", logouturl);
		
		
	}

	@AfterClass
	
	public void teardown() throws Throwable {
		Thread.sleep(5000);
		driver.quit();
	}

}
