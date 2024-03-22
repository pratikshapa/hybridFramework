package com.hybrid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbBase{
	public static WebDriver driver;
	
    public void inhokeBrowser(){
	
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/signup");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
     }

}
