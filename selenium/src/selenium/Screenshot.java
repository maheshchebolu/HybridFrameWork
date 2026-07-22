package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.jntuksdc.co.in/");
		
		driver.manage().window().maximize();

		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("C:\\Users\\mahes\\OneDrive\\Documents\\mahesh20.png"));
		
	}

	
	}


