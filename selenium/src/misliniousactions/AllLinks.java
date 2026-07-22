package misliniousactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllLinks {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.manage().window().maximize();
	}
	
	
	@Test
		public void allLinks() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("no of links"+allLinks.size());
		
		for(int i=1;i<allLinks.size();i++) {
			
			System.out.println(allLinks.get(i).getText());
			
			allLinks.get(i).click();
			
			Thread.sleep(3000);
			
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			
			
			
			 
		}
		
		}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
