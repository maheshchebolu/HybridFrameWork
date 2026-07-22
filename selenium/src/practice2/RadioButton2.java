package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mahesh");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		Thread.sleep(5000);
		
		WebElement TextBox =wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		
		TextBox.click();
		Thread.sleep(3000);
		
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		
		checkbox.click();
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		
		WebElement Radiobutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yesRadio")));
		
		Radiobutton.click();
		
		
		driver.quit();
	}

}
