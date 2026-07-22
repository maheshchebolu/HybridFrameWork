package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException, IOException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(3000);
		
		driver.getTitle();
		
		driver.navigate().back();
		System.out.print(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		driver.get("https://www.youtube.com/");
		driver.getTitle();
		
		Thread.sleep(3000);

		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\mahes\\OneDrive\\Documents\\Mahesh A\\nov1.png"));
    
		driver.quit();

	}

}
