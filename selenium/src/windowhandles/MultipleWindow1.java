package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class MultipleWindow1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	public void Multiplewindowtest() throws InterruptedException {
		
		
		String homeWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Set<String>allWindowIds = driver.getWindowHandles();
		
		Iterator<String>it = allWindowIds.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals("Not Found")) {
				
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
	}
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
