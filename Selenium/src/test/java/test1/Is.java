package test1;

import java.time.Duration;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Is {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement element=driver.findElement(By.id("male"));
		element.click();
		System.out.println(element.isSelected());
		WebElement ele=driver.findElement(By.xpath("//button[@name='submit']"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());

		
		

		
	}

}
