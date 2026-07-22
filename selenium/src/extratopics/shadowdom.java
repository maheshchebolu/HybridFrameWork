package extratopics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class shadowdom {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void shadowdomtest() {
		
		WebElement shadowHost1 = driver.findElement(By.xpath("//div[@id='shadow_host']"));
		
		SearchContext  shadowRoot1 = shadowHost1.getShadowRoot();
		
		WebElement textbox = shadowRoot1.findElement(By.xpath("//input[@type='text']"));
		
		textbox.sendKeys("selenium");
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
