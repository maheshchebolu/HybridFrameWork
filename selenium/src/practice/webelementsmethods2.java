package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethods2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		
		
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
