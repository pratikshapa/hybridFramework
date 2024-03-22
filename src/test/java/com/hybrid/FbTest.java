package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.Facebook;


public class FbTest extends FbBase{
	
	Facebook fb = new Facebook();
	FbBase fb1 = new FbBase();
	
	@BeforeClass
	public void setUp() {
		fb1.inhokeBrowser();
	}
	
	@Test
	 public void test() {
		 String str = driver.getTitle();
		 System.out.println(str);
		 Assert.assertEquals(str,"Facebook");
	 }
	 
	@Test
	 public void signUpDetails()
	 {
		Facebook fb = new Facebook();
		 fb.firstName();
		 fb.lastName();
		 fb.mobileNum();
		 fb.newPassword();
		 fb.date();
		 fb.month();
		 fb.year();
		 fb.gender();
		 fb.signup();
	 }
}
