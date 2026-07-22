package testng;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinHotel {
	
	@Test(priority=2)
	public void Logintest() {
		System.out.println("Browser started");
		System.out.println("app launched");
		Assert.assertTrue(true);
		System.out.println("Login sucessfull");
		System.out.println("Browser Closed");
	}
	@Test(priority=1)
	public void Registration() {
		
		System.out.println("Browser started");
		System.out.println("app launched");
		System.out.println("Registration sucessfull");
		System.out.println("Browser closed");
	}
	
	
	@Test(priority=4)
	public void Forgotpassword() {
		System.out.println("Browser started");
		System.out.println("app launched");
		System.out.println("Forgot password");
		System.out.println("app closed");
	}
	
	@Test(priority=3)
	public void Changepassword() {
		System.out.println("Browser started");
		System.out.println("app launched");
		System.out.println("change password sucessfull");
		System.out.println("app closed");
		
	}
	
	

}
