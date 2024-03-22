package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hybrid.FbBase;

public class Facebook extends FbBase{
	
	public Facebook() {
	
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath="//input[@name='reg_email__']")
		private WebElement mobileNum;
		
		
		@FindBy(xpath="//input[@name='reg_passwd__']")
		private WebElement newPassword;
		
		
		@FindBy(xpath="//select[@name='birthday_day']")
		private WebElement date;
		@FindBy(xpath="//select[@name='birthday_month']")
		private WebElement month;
		@FindBy(xpath="//select[@name='birthday_year']")
		private WebElement year;
		
		
		@FindBy(xpath="(//input[@type='radio'])[1]")
		private WebElement gender;
		
		@FindBy(xpath="//button[@name='websubmit']")
		private WebElement signUp;
	

		public void firstName(){
			firstName.sendKeys("Pratiksha");
		}
		
		public void lastName(){
			lastName.sendKeys("Patil");
		}
		
		public void mobileNum() {
			mobileNum.sendKeys("9921690522");
		}
		
		public void newPassword() {
			newPassword.sendKeys("pp@123");
		}
		
		public void date() {
			Select s = new Select(date);
			s.selectByValue("28");
		}
		
		public void month() {
			Select s = new Select(month);
			s.selectByValue("11");
			}
		
		public void year() {
			Select s = new Select(year);
			s.selectByValue("2000");
		}
		
		public void gender() {
			gender.click();
		}
		
		public void signup() {
			signUp.click();
		}
}
