package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class MultipleWindowHandle4 {
	
	WebDriver driver;
	private String homeWindowId;
	private Object Title;
	
	@BeforeMethod
	
	public void setUp() {
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	
	public void multipleWindowHandle() throws InterruptedException {
		String allWindowIds = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'img/google-play.png')]")).click();
		
		switchToWindow("Not Found");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'img/ios-button.png')]")).click();
		
		switchToWindow("TestFlight - Apple");
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		switchToWindow("Legal - Apple Media Services - Apple");
		
		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
	}
	
	private void switchToWindow(String string) {
          
		Set<String>allWindowIds = driver.getWindowHandles();
		
		Iterator<String>it = allWindowIds.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals(Title)) {
				break;
			}
		}
	}

	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.quit();
	}

}
