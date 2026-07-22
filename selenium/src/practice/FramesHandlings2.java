package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesHandlings2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
	}

	@Test
	public void frameshandling() throws InterruptedException {
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("//a[contains(@href,'monkeyspaw.htm')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");
		
		driver.findElement(By.xpath("(//font[contains(text(),'I Hate Frames')]/parent::a)[1]")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
