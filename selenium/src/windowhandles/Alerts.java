package windowhandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}
	
	@Test
	public void alerts () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@name='proceed']")).click();
		
		Alert a1 = driver.switchTo().alert();
		
		System.out.println(a1.getText());
		
		Assert.assertEquals(a1.getText(), "Please enter a valid user name");
		
		Thread.sleep(3000);
		a1.accept();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
