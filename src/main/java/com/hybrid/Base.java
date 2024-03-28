package com.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.util.Utility;

public class Base {

	
	 public static WebDriver driver;
	 public static String projectPath = System.getProperty("user.dir");
	
	public void launchWebsite() {
		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		Utility.setImplicitWait(10);
		
	}
	
		
	
}