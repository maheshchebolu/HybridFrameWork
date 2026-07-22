package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicWebTable {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dynamicwebtable() {
		
		WebElement table = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
		
		List<WebElement>allRows = driver.findElements(By.tagName("tr"));

		for(WebElement row:allRows)
		{
			List<WebElement> allCols=row.findElements(By.tagName("td"));
			for(WebElement col:allCols)
			{
				System.out.print(col.getText()+"\t");
			}
			System.out.println();
		}
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
