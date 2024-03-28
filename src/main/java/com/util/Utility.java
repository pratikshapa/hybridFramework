package com.util;

import java.io.File;

import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hybrid.Base;
import com.hybrid.FbBase;

public class Utility extends Base {
	

	public static void setText(String text,WebElement ele) {
		ele.sendKeys(text);
	}
	
	public static void elementClick(WebElement ele) {
		ele.click();
	}
	
	public static void setImplicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	
	public String takeScreenshot(String testName)throws IOException{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//String CurrentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYYMMDDhhmmss"));
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY_MM_DD_hh_mm_ss"));
		
		String des = projectPath + "\\Sellenium\\ScreenShots" + testName + date + ".png";
				File destination = new File(des);
				
				FileUtils.copyFile(scr, destination);
		
		return des;
		
	}
}
