package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01 {
	
	
	//1
@BeforeClass
public void launchBrowser() {
	System.out.println("launch ff");
}
//2//5
@BeforeMethod
public void login() {
	System.out.println("login to app");
	
}
//3
@Test(priority=1)
public void composemailTest() {
	System.out.println("composemail");
}
	@Test(priority=2)
	public void deletetesxt() {
	
	System.out.println("delete mail test"); 
}
@Test(priority=3)
public void searchmailtext() {
	
	
	
	System.out.println("search mail text"); 
}
	@AfterMethod
	public void logout() {
		
		System.out.println("logout");
		
	}
	//4//7
	@AfterClass	
		public void quitBrowser() {
		System.out.println("QuitBrowser");
		
		
		
		
	}
}