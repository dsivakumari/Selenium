package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itera {

	public static void main(String[] args)  throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	 List<WebElement> list = driver.findElements(By.xpath("//label[@class='custom-control-label']"));
	 System.out.println(list.size());
	 Thread.sleep(3000);
	 for (WebElement lists :list) {
		 if((lists.getText().equals("Selenium Webdriver") || (lists.getText().equals("Testim")))) {
			 lists.click();
			 
			 
		 }
	 }
		
	}

}
