package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interduction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	//	driver.get("https://www.flipkart.com/");
		
	//	System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getPageSource());
	//	System.out.println(driver.getWindowHandle());

		//driver.close();
		//driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.id("name")).sendKeys("kumari");
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("hello india");
		
		//driver.findElement(By.id("phone")).sendKeys("9010957106");
		//driver.findElement(By.id("email")).sendKeys("dsivakumari@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("1234567");
		//driver.findElement(By.id("address")).sendKeys("nellore");
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		
		//driver.findElement(By.id("male")).click();
		
		//driver.findElement(By.id("tuesday")).click();
		//driver.findElement(By.id("friday")).click();
		//WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		//Select sel=new Select(dropdown);
					
		//sel.selectByVisibleText("Norway");
		//sel.selectByValue("4");
		//sel.selectByIndex(6);
		driver.findElement(By.xpath("//label[@for='1year']")).click();
		driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
		
		
		
		
		

		
		
		
		
		
		
		

		 
		
	}

}
