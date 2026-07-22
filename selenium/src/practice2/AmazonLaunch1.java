package practice2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLaunch1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//WebElement searchBox = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")));

        searchBox.sendKeys("Laptop");
        
        //search button
        
        WebElement searchButton = wait.until(
        		ExpectedConditions.elementToBeClickable(
        				By.id("nav-search-submit-button")));
        searchButton.click();
        
        

        // Handle new tab
        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Verify Product Page Loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("productTitle")));

        String productTitle =
                driver.findElement(By.id("productTitle")).getText();

        System.out.println("Product Page Loaded Successfully");
        System.out.println("Product Name: " + productTitle);

        driver.quit();
    }
}

		

