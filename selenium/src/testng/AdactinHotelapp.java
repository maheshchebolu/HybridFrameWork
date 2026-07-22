package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelapp {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Browser Started");
		System.out.println("App Launched");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Browser Closed");
	}
	
	@Test
	public void LoginTest() {
		System.out.println("Login sucessfully");
	}
	
	@Test
	public void RegistrationTest() {
		System.out.println("Registration sucessfully");
	}
	
	@Test
	public void ChangePassword() {
		System.out.println("ChangePassword sucessfully");
	}

}
