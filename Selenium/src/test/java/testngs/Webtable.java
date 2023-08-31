package testngs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Webtable {
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		//List<WebElement> colsCount =driver.findElements(By.id("countries"));
		int rowscount =driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowscount);
		int columecount =driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(columecount);
		
//		for(int i=2;i<=rowscount;i++) {
//			for(int j=2;j<=columecount;j++) {
//				
//				String value =driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
//				
//				System.out.println(value);
//				
//		}
//			
//		}
		
		
		cellvalue(driver,"5","4");
		checkbox(driver,"3");
		checkbox(driver,"8");
			
		
			
		}
		
	public static void cellvalue (WebDriver driver,String rowno,String columeno ) {
		String cellvalue=driver.findElement(By.xpath("//table[@id='countries']//tr["+rowno+"]//td["+columeno+"]")).getText();
		System.out.println(cellvalue);
	}
	public static void checkbox (WebDriver driver,String rowno ) {
		driver.findElement(By.xpath("//table[@id='countries']//tr["+rowno+"]//td[1]//input")).click();
	
	
	}
}


