package radionbuttoncheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
	
	@Test
	public void radiobuttontest1() {
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	public void radiobuttontest2() throws InterruptedException {
	
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//input[@value='Milk']")));
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Milk']")));
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());

	}
	
	public void radiobuttontest3() throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoview(true);",driver.findElement(By.xpath("//input[@value='Cheese']")));
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Cheese']")));
		
		Thread.sleep(3000);
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
