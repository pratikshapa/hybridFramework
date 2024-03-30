package com.hybrid;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Utility;

public class Base {

	
	 public static WebDriver driver;
	 public static String projectPath = System.getProperty("user.dir");
	 
	 public static String childwindow;
 	 public static String mainpage;
	
	public void launchWebsite() {
		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Utility.setImplicitWait(10);
	}
		
		public void windowHandle()
		{
			 java.util.Set<String> All_Id = driver.getWindowHandles();
		        Object[] Id = All_Id.toArray();
		      
		        Utility.setImplicitWait(5);
		        for(int i=0; i< Id.length ;i++) 
		        {
		        	if(Id[i].toString().equalsIgnoreCase(mainpage))
			    	{
			    		System.out.println(mainpage);
			    	}
			    	else
			    	{
			    		childwindow= Id[i].toString(); 
			    		System.out.println(childwindow);
			    	}
		        }
		       
		    	
		
		}
	
	
		
	
}