package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch1 {

	public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       
       driver.get("https://demoqa.com/text-box");
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mahesh");
       
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ss@gmail.com");
       
       driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("h.no=22");
       
       driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("eyy");
       
       driver.quit();
		
	}

}
