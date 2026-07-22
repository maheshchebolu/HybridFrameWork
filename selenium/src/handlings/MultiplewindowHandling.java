package handlings;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplewindowHandling {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void multiplelogintest1() throws InterruptedException {
		String homewindowid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'img/google-play.png')]")).click();
		
		Set<String>allWindowIds = driver.getWindowHandles();
		
		Iterator<String>it= allWindowIds.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals("Not Found")) {
			
			break;
		}
		}
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homewindowid);
		
		
		driver.findElement(By.xpath("//img[contains(@src,'img/ios-button.png')]")).click();
		
		
		allWindowIds=driver.getWindowHandles();
		
		it=allWindowIds.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals("TestFlight - Apple")) {
				break;
				
			}
		}
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homewindowid);
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
