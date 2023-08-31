package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Screenshort {
	@Test
	public void TestGoogle() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("email")).sendKeys("HRY Tutorials",Keys.ENTER);
		Thread.sleep(1000);
		
		SoftAssert softAssert=new SoftAssert();
		//Title assertion
		String actualTitle =driver.getTitle();
		String expectedTitle ="Log in to fecebook";
		softAssert.assertEquals(actualTitle,expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl ="https://www.amazon.in";
		softAssert.assertEquals(actualUrl,expectedUrl, "URL is mismatched");
		
		//Errormessage assertion
		String actualErrorMessage=driver.findElement(By.xpath("//div[@='email']/dic"))
		
		
		driver.quit();
		softAssert.assertAll();
		
		
		
	}

}
