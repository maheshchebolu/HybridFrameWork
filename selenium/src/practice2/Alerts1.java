package practice2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
       
       Alert alert = driver.switchTo().alert();
       
       alert.dismiss();
	}

}
