package dropdowntesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
driver.close();
	}

}
