package waits;

import java.time.Duration
;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Explicitwait {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		driver.manage().window().maximize();
	}

	@Test
	public void explicitwait() {
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		mywait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='screen']")).getText(), "9" );
		}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
