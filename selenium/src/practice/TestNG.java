package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Browser started");
		System.out.println("App launched");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("App closed");
	}
	
	@Test(priority=2) 
	public void loginTest() {
		System.out.println ("login successfull");
	}
	
	@Test(priority=1)
	public void Registration() {
		System.out.println("Registration successfull");
	}
	
	@Test(priority=0)
	public void ForgotPassword () {
		System.out.println("Forgot password");
	}
	
	@Test(priority=3) 
	public void changepassword() {
		System.out.println("change password");
	}

}
