package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.kvb.co.in/");
        driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        
        action.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']")))
        .pause(2000)
        .moveToElement(driver.findElement(By.xpath("//a[text()='Loans ']")))
        .pause(2000)
        .click(driver.findElement(By.xpath("//a[text()='Two Wheeler Loan']")))
        .build()
        .perform();
        
        driver.quit();
		
	}

}
