package com.hybrid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaBase {
	public static WebDriver driver;
	
	
	public void launch() {
		
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}


}
