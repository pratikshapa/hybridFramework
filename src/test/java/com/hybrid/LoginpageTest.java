package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.LoginPagePom;

public class LoginpageTest extends Base{
	
	LoginPagePom loginpagepom = new LoginPagePom();
	Base base = new Base();
	
	
	@BeforeClass
	public void setup() {
		
		base.launchWebsite();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
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

}
