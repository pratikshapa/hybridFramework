package com.hybrid;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.Utility;

public class Base {
	
	 public static WebDriver driver;
	
	
	public void launchWebsite() {
		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		Utility.setImplicitWait(10);
		
	}
	
}
	
	
