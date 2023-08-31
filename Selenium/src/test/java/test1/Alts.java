package test1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alts {

	public static void main(String[] args) throws Throwable  {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//driver.findElement(By.cssSelector("[onclick='alertbox()']")).click();
		
		//driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		//driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
		
		Alert al=driver.switchTo().alert();
	
		Thread.sleep(3000);
		//al.accept();
		//al.dismiss();
		al.sendKeys("hello india");
		
		
	}

}
