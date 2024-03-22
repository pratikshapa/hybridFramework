package com.hybrid;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.pomclasses.AdminPagePom;

public class AdminTest extends AdminBase {
	
	AdminPagePom admin = new AdminPagePom();
	AdminBase base = new AdminBase();
	
	@BeforeClass
	public void setup(){
		base.getBrowser();
	}
	
	@AfterClass
	/*public void teardown()
	{
		driver.close();
	}*/
	
	@Test
	public void TestTitle()
	{
		String str = driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, "OrangeHRM");
	}
	
	@Test
	public void Admin() {
		AdminPagePom admin = new AdminPagePom();
		
		String str = admin.getUsername();
		String str1 = admin.getPassword();
		
		Assert.assertEquals(str, "Admin");
		Assert.assertEquals(str1,"admin123");
	     admin.setUsername(str);
		admin.setPassword(str1);
		admin.login();
		admin.search();
		admin.adminClick();
		admin.job();
		admin.jobtitles();
		admin.checkjobTitles();
	}
}
