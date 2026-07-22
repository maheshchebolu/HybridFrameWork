package dropdowntesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

driver.get("https://www.youtube.com/");

Thread.sleep(3000);

driver.quit();
	}

}
