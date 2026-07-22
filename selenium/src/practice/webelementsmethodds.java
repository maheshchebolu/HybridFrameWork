package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethodds {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.id("datepick_in")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepick_in")).sendKeys("01/11/2025");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
