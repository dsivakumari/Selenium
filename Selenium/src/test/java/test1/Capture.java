package test1;

import java.io.File;
import java.time.Duration;

import javax.xml.transform.Source;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Capture {

	public static void main(String[] args)  throws Throwable {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".//src//maven.png");
		FileUtils.copyFile(source, target);
		
	 
		

	}

}
