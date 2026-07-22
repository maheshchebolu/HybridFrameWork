package linkstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
			
		driver.navigate().to("https://www.programiz.com/java-programming/online-compiler/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://echallan.parivahan.gov.in/index/accused-challan");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
		
	}

}
