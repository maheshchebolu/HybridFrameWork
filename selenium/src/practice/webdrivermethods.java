package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		Thread.sleep(3000);
		
		driver.getTitle();
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	//System.out.println(driver.getPageSource());
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	driver.quit();
		 
		 
		 
	}

}
