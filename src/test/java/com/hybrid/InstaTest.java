package com.hybrid;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.InstaPom;

import org.testng.Assert;
public class InstaTest extends InstaBase {
	
	InstaBase base = new InstaBase();
	InstaPom insta = new InstaPom();
	
	@BeforeClass
	public void setup()
	{
		base.launch();
	}
	@Test
	public void test()
	{
		String str = driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str,"Sign up.Instagram");
	}
	
	@Test
	public void instaSignUp() {
		
		InstaPom insta = new InstaPom();
		insta.mobileno();
		insta.fullName();
		insta.username();
		insta.password();
		insta.signUp();
	}

}
