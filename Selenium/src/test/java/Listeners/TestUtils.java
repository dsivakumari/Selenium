package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

public class TestUtils {
	public void getScreenshort() throws IOException{
		WebDriver driver;
		Date currentdata = new Date();
		String current;
		String screenshortfilename =current data.toString().replace(" "," ").replace(":","-");
		File screenshortFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshortFile, new File(".//Screenshort//"+ screenshortfilename +".png"));
		
	}
	

}
