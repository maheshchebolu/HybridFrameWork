package Optim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class assignment2 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://trello.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@class,'Buttonsstyles__Button')][1]")).click();
	}
	
	@Test
	public void assignment() throws InterruptedException  {
		
            Thread.sleep(3000);
            
		driver.findElement(By.xpath("//input[@id='username-uid1']")).sendKeys("maheshchebolu17@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mahesh@17081998");
		
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[text()='Create new board']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
