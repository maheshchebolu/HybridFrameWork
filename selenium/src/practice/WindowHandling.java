package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling {
	
     WebDriver driver;
     @BeforeMethod
     public void setUp() {
    	 driver = new ChromeDriver();
    	 driver.get("https://adactinhotelapp.com/");
    	 driver.manage().window().maximize();
    	
     }
     
     @Test
     public void multiplewindowhandling() throws InterruptedException{
    	 
    	 String homewindowid = driver.getWindowHandle();
    	 
    	 driver.findElement(By.xpath("//img[contains(@src, 'google-play')]")).click();
    	 
    	 Thread.sleep(3000);
    	 
    	 Set<String>allwindowIds = driver.getWindowHandles();
    	 
    	 Iterator<String>it = allwindowIds.iterator();
    	 
    	 while(it.hasNext()) {
    		 driver.switchTo().window(it.next());
    		 if(driver.getTitle().equals("Not Found"));
    		 {
    			 break;
    		 }
    	 }
    	 
    	 Thread.sleep(3000);
    	 driver.switchTo().window(homewindowid);
    	 
    	 driver.findElement(By.xpath("//img[contains(@src, 'img/ios-button.png')]")).click();
    	 
    	 Thread.sleep(3000);
    	 allwindowIds = driver.getWindowHandles();
    	 it = allwindowIds.iterator();
    	 
    	 while(it.hasNext()) {
    		 driver.switchTo().window(it.next());
    		 if(driver.getTitle().equals("TestFlight - Apple"));
    		 {
    			 break;
    		 }
    	 }
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//a[text()='Terms Of Service']")).click();
    	 
    	 Thread.sleep(3000);
    	 driver.switchTo().window(homewindowid);
    	 
    	 allwindowIds = driver.getWindowHandles();
    	 it=allwindowIds.iterator();
    	 while(it.hasNext()) {
    		 driver.switchTo().window(it.next());
    		 if(driver.getTitle().equals("Legal - Apple Media Services - Apple")) {
    			 break;
    		 }
    	 }
    		driver.findElement(By.xpath("//a[text()='Choose your country/region']")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.switchTo().window(homewindowid);
    		
    	 
     }
     
     @AfterMethod
     public void teardown() throws InterruptedException  {
    	 Thread.sleep(3000);
    	 driver.quit();
     }

}
