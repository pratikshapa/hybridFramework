package com.hybrid;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.pomclasses.AdminJobTitlesPom;
import com.util.Utility;

public class AdminJobTitlesTest extends Base{
	 Base base = new Base();
	
	
	 @BeforeClass
	 public void setup(){
		
		base.launchWebsite();
	}
	
	 @Test
	public void loginpage() throws InterruptedException {
		 	LoginpageTest loginpagetest = new LoginpageTest();
		 	loginpagetest.adminLogin();
		 	
		 	
		
		 	Utility.setImplicitWait(5);
		 	AdminJobTitlesPom admin = new AdminJobTitlesPom();
		 	
		 	Thread.sleep(5000);
		 	admin.AdminClick();
		 	admin.job();
		 	admin.jobTitles();
		 	
		 	
		 	Thread.sleep(5000);
		 	admin.Add();
		    admin.AddJobTitle("AutomationTester");
		 	
		 	admin.JobDescription("i work on both manual and automation testing");
		 	admin.AddNote("testing");
		 	admin.submit();
		 	
		 	
		 	//admin.Arrow();
		 	
		 	}
	 }
