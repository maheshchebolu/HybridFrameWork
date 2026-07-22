package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkbox {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
	}
	
	@Test
	public void checkbox () throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
