package misliniousactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class MouseHover {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.kvb.bank.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mousehover() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']")))
		.pause(2000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Loans ']")))
		.click(driver.findElement(By.xpath("//a[text()='4 Wheeler loan (Passenger vehicle)']")))
		.build()
		.perform();
		
		System.out.println(driver.getTitle());
         driver.navigate().back();
         Thread.sleep(3000);
         driver.navigate().forward();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
