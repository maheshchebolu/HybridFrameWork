package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {

          WebDriver driver = new ChromeDriver();
          driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
          driver.manage().window().maximize();
          
          WebElement username = driver.findElement(By.name("username"));
          username.clear();
          username.sendKeys("mahesh");
          Thread.sleep(5000);
          WebElement submit = driver.findElement(By.xpath("//input[@name='submitbutton'][2]"));
          submit.click();
          
          Thread.sleep(5000);
          WebElement checkbox = driver.findElement(By.xpath("//input[@value='cb1']"));
          if(! checkbox.isSelected()) {
        	  checkbox.click();
          }
          Thread.sleep(5000);

          WebElement radio =
        		  driver.findElement(By.cssSelector("input[value='rd1']"));

        		  radio.click();
        		  Thread.sleep(5000);
        		  
        		  WebElement dropdown= driver.findElement(By.name("dropdown"));
        		  
        		  Select s1= new Select(dropdown);
        		  s1.selectByVisibleText("Drop Down Item 2");
        		  
        		  driver.quit();
		
	}

}
