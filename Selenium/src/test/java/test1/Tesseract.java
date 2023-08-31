package test1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tesseract {

	public static void main(String[] args)  throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		String w1=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		set<String> handles=driver.getWindowHandle();
		
		for(String han:handles) {
			
			if (!w1.equals(han)) {
				driver.switchTo().window(han);
				break;
				
				
			}
		}
		driver.findElement(By.id("disha-banner-close")).click();
		driver.findElement(By.xpath()
			
		
		
		
				
	}

}
