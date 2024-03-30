package com.hybrid;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pomclasses.LoginPagePom;
import com.util.Utility;

public class LoginpageTest extends Base{
	
	
	LoginPagePom loginpagepom = new LoginPagePom();
	Base base = new Base();
	Utility utility = new Utility();
	
	
	@BeforeClass
	public void setup() {
		
		base.launchWebsite();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}*/
	
	@Test
	public void testTitle()
	{
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
		Assert.assertEquals(webTitle, "OrangeHRM");
	}
	
	@Test
	public void adminLogin() {
		LoginPagePom loginpagepom = new LoginPagePom();
		
		String username = loginpagepom.getUsername();
		String password = loginpagepom.getPassword();
		
		Assert.assertEquals(username, "Admin");
		Assert.assertEquals(password, "admin123");
		
		loginpagepom.setUsername(username);
		loginpagepom.setPassword(password);
		loginpagepom.login();   
	}
	
	@Test
	public void loginlink()
	{
		LoginPagePom loginpagepom = new LoginPagePom();
		loginpagepom.homepageLink();
	}
	
	@Test
	public void windowHandles()
	{
		base.windowHandle();
	}
	       
	@Test
	public void screenShot() throws IOException {
		Utility utility = new Utility();
		
		utility.takeScreenshot("OHRM");
		
	}

}
