package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahesh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		
		driver.quit();
		
	}

}
