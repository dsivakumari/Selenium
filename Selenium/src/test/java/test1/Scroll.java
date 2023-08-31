package test1;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//WebElement element=driver.findElement(By.xpath("//a[@href='https://www.amazon.es/ref=footer_es']"));
		WebElement element=driver.findElement(By.xpath("//a[text()='See all']"));
		
	
	   org.openqa.selenium.Point loc=element.getLocation();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+loc);
		
	}

}
