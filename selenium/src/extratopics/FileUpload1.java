package extratopics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileUpload1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileupload() throws InterruptedException {
		
		WebElement picture = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		
		Thread.sleep(3000);

		
		picture.sendKeys("C:\\Users\\mahes\\OneDrive\\Pictures\\Screenshots");
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
