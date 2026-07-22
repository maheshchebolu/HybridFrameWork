package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test
	public void multiplewindowhandling() throws InterruptedException {
		
		String homewindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src, 'google-play')]")).click();
		
		Thread.sleep(3000);
		
		Set<String>allWindowIds = driver.getWindowHandles();
		
		Iterator<String>it = allWindowIds.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals("Not Found"))
			{
			break;
			
		}
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");

		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homewindowId);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[contains(@src,'img/ios-button.png')]")).click();
		Thread.sleep(3000);
		
		allWindowIds = driver.getWindowHandles();
		it = allWindowIds.iterator();
		
		Thread.sleep(3000);
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals("TestFlight - Apple"))
			{
			break;
		}
		
		}
Thread.sleep(3000);

   driver.findElement(By.xpath("//a[text()='Terms Of Service']")).click();

   Thread.sleep(3000);
   
   driver.switchTo().window(homewindowId);
   
   Thread.sleep(3000);
   
   allWindowIds = driver.getWindowHandles();
   it = allWindowIds.iterator();
   while(it.hasNext())
   {
   driver.switchTo().window(it.next());
   if(driver.getTitle().equals("Legal - Apple Media Services - Apple"))
   {
	   break;
   }
   }
   
   driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
   Thread.sleep(3000);
   
   driver.switchTo().window(homewindowId);
		}

	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
