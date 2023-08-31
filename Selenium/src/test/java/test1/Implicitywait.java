package test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Implicitywait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
					
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
				
		driver.findElement(By.id("display-other-button")).click();
				
		WebElement element=driver.findElement(By.id("hidden"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));

		System.out.println(element.isDisplayed());
		
		
	
		
		
		
		
	}

}
