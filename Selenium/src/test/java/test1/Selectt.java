package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectt {

	public Selectt(WebElement dropdown) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel=new Select(dropdown);
					
		//sel.selectByVisibleText("Norway");
		//sel.selectByValue("4");
		sel.selectByIndex(6);
		
		
		
		
		
	}

}
