package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mce_0_ifr");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("tinymce")).clear();
		
		driver.findElement(By.id("tinymce")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}
