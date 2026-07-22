package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop4 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void DragAndDroptest() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
				driver.findElement(By.xpath("//div[@id='droppable']")))
		.build().perform();
		
		Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
