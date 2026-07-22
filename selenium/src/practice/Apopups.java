package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Apopups {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	}
	
	@Test
	public void popups() throws AWTException, InterruptedException {
		String username = "admin";
		
		StringSelection stringSelection = new StringSelection(username);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.delay(2000);
		
		String password = "admin";
		
		stringSelection  = new StringSelection(password);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	

		Thread.sleep(2000);
		
		//Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Basic Auth']/following-sibling::p")).getText().trim(), "Congratulations! You must have the proper credentials.");

		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Basic Auth']/following-sibling::p")).getText().trim(), "Congratulations! You must have the proper credentials.");

		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
