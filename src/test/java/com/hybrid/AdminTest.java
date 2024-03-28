package com.hybrid;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.pomclasses.AdminPagePom;
import com.util.Utility;

public class AdminTest extends Base{
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
		 	AdminPagePom admin = new AdminPagePom();
		 	//admin.Arrow();
		 	admin.job();
		 	Thread.sleep(5000);
		 	admin.jobTitles();
		 	admin.Add();
		 	admin.AddJobTitle();
		 	admin.JobDescription();
		 	admin.AddNote();
		 	admin.submit();
			
		
	}
	 
	
	
	
		
		
		
	
		
		
		
		//admin.job();
		//admin.jobtitles();
		//admin.checkjobTitles();
	//}
	
	
	/*@AfterClass
	public void teardown()
	{
		driver.close();
	}*/
	
	/*@Test
	public void TestTitle()
	{
		String str = driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, "OrangeHRM");
	}*/
	
	
	
}
