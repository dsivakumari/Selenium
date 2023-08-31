package testngs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhibus {
	@Test
	public void test() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.findElement(By.id("source")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		
		driver.findElement(By.id("destination")).sendKeys("Nellore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Nellore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='24']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.id("Bustypes1")).click();
		driver.findElement(By.id("Bustypes3")).click();
		driver.findElement(By.xpath("//a[text()='Price ']")).click();
		

		//driver.findElement(By.id("ShowBtnHide11")).click();
		driver.findElement(By.xpath("//span[@class='book'][normalize-space()='Select Seat']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'₹970')]")).click();
		//driver.findElement(By.xpath("//a[@id='UO6-5ZZ']")).click();

		
	
		
//		List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='8']"));
 //for(WebElement seat1:seat)
    //{
//System.out.println(seat1.getText());
//if(seat1.getText().equals("RSRTC"))
//{
//seat1.click();
//  		break;
//     	}
        }


		
			}

		
		
	




		
		
		
	


