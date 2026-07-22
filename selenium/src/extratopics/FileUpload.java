package extratopics;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileupload() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("//img[@alt='New post']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/img")).click();
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/img")).click();

		
		Thread.sleep(3000);
		
		String path = "C:\\Users\\mahes\\OneDrive\\Pictures\\Screenshots mahesh.png";
		
		StringSelection stringSelection = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
