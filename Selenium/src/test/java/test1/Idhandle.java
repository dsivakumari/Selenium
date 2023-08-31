package test1;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Idhandle {

	private static final Object Window1 = null;

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		Set<String> window1 = driver.getWindowHandles();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		//System.out.println(window1);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			if(!Window1.equals(handle)) {
				driver.switchTo().window(handle);
				//driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("kumari");
				
				
			}
			
		}
		
		
		
		
	}

}
