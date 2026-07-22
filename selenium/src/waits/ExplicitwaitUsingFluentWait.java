package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


import io.netty.handler.timeout.TimeoutException;

public class ExplicitwaitUsingFluentWait {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void explicitwait() {
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		FluentWait<WebDriver>mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(20))
				.ignoring(TimeoutException.class);
		
		mywait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@id='spinner']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='screen']")).getText(), "8");

	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
