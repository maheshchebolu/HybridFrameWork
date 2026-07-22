package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("name"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
		
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.id("username_span")).getText());
		
		driver.quit();
		
	}

}
