package selenium;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
	}
	
	@Test
	public void DragAndDropTest() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		
		//switch to frame
		
		driver.switchTo().frame(0);
		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
                driver.findElement(By.xpath("//div[@id='droppable']")))

		.build() //integrate
		.perform(); //execute
		
		Thread.sleep(3000);
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	}
