package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.pause(2000)
		.keyDown(Keys.DOWN)
		.pause(2000)
		.keyDown(Keys.DOWN)
		.pause(2000)
		.keyDown(Keys.DOWN)
		.pause(2000)
		.keyDown(Keys.DOWN)
		.click()
		.build()
		.perform();
		
		driver.quit();
	}

}
