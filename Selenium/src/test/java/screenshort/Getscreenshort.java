package screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Getscreenshort extends Maintest {
	
	public static String capture (String screenshortName) throws IOException  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String dest =System.getProperty("user.dir") + "/Errorscreenshort/" + screenshortName + ".png";
		
		File destination = new File (dest);
		FileUtils.copyFile(source, destination);
		
		return dest;
		
		
			
		
		
	}

}
