package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
	     System.out.println(driver.findElement(By.id("username_span")).getAttribute("text"));	
	
	     
	     System.out.println(driver.findElement(By.id("username")).getLocation().getX());
	     System.out.println(driver.findElement(By.id("username")).getLocation().getY());
	     
	     System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
	     System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
	     
	     System.out.println(driver.findElement(By.id("username")).getRect().getX());
	     System.out.println(driver.findElement(By.id("username")).getRect().getY());
	     
	     System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
	     System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
	     
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
		
		
	}

}
