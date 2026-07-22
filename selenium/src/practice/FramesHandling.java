package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesHandling {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		
	}
	
	@Test
	public void frameshandling(){
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']")))
.build().perform();
		
		}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	}
	

}
