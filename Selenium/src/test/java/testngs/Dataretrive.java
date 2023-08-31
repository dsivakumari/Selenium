package testngs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class Dataretrive {
	@Test (dataProvider = "logintest")

	
	public void datatest(String  Username,String password) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/authenticate/Login");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.findElement(By.name("emailid")).sendKeys(Username);
		
		driver.findElement(By.name("pword")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals(url, "http://poojastore.marolix.com/Admin/Dashboard");
			           
	
	}
	@DataProvider (name="logintest")
	public Object[][] dataset() {
		Object [][] data =new Object [3][2];
		data [0][0]="Admin123@gmail.co";
		data [0][1]="123456789";
		data [1][0]="pooja132@gmail.com";
		data [1][1]="1234";
		
		data [2][0]="kumari";
		data [2][1]="5643";
		
		
		return data;
		
		
		
		
	}

}
