package com.pomclasses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.InstaBase;

public class InstaPom extends InstaBase{
	
	public InstaPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='emailOrPhone']") private WebElement mobileNum;
	@FindBy(xpath="//input[@name='fullName']") private WebElement fullName;
	@FindBy(xpath="//input[@name='username']") private WebElement username;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="(//button[@class=' _acan _acap _acas _aj1- _ap30'])[2]") private WebElement signUp;
	
	public void mobileno() {
		mobileNum.sendKeys("9921690522");
	}
	
	public void fullName() {
		fullName.sendKeys("Pratiksha Patil");
	}
	
	public void username() {
		username.sendKeys("pp@123");
	}
	
	public void password() {
		password.sendKeys("pp@123");
	}
	
	public void signUp() {
		signUp.click();
	}

}
