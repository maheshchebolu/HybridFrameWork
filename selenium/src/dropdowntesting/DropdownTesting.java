package dropdowntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry porter");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
