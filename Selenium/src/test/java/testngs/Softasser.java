package testngs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasser {
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin.hospiol.com/site/login");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		SoftAssert sf=new SoftAssert();
		 WebElement user=driver.findElement(By.name("username"));
 		 WebElement pass=driver.findElement(By.name("password"));
 		
 		// sf.assertTrue(user.isEnabled());
 		 sf.assertTrue(user.isSelected());
 		// Assert.assertTrue(user.isSelected());
 		 
 		 driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
 		 sf.assertTrue(pass.isEnabled());
 		 driver.findElement(By.name("password")).sendKeys("Reset@123");
 		 driver.findElement(By.xpath("//button[@class='btn']")).click();
 		sf.assertAll();
	}

}
