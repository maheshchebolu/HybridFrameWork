package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		

		
		WebElement form1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		form1.sendKeys("mahesh");
		
		WebElement form2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		
		form2.sendKeys("ss");
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ss@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9856111111");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("May");
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1998");
		
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='15']")).click(); 
		
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("08jun2026");
		
		
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Hindi");
		
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
			
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\mahes\\OneDrive\\Pictures\\Screenshots");
		
		
		//current address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Hyd");
		
		//js.executeScript("window.scrollBy(0,500");
		//state
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("NCR");
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys(org.openqa.selenium.Keys.ENTER);
		
		//city
		driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
		driver.findElement(By.id("react-select-4-input")).sendKeys(org.openqa.selenium.Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		String successMsg = driver.findElement(By.xpath("example-modal-sizes-title-lg")).getText();
		
		if(successMsg.contains("Thanks for submitting the form")) {
			System.out.println("Form is submitted");
		} else {
			System.out.println("submission is failed");
		}
		
		Thread.sleep(5000);
		driver.quit();
		


		}

}
