package linkstesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.programiz.com/java-programming/online-compiler/");
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
	//	System.out.println(title);
		driver.close();
		
		
	}

}
