package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.Base;
import com.util.Utility;

//java design pattern page object model
public class LoginPagePom extends Base{
	
	public LoginPagePom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']") private WebElement username;
	
	@FindBy(xpath="//p[text()='Password : admin123']") private WebElement password;
	
	@FindBy(xpath="//input[@name='username']") private WebElement inputusername;
	
	@FindBy(xpath = "//input[@name='password']") private WebElement inputpassword;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']") private WebElement hompagelink;
	
	public String getUsername() {
		
		String original = username.getText();
		String username = original.substring(original.indexOf('A'));
		return username;
	}
	
	public String getPassword() {
		String original = password.getText();
		String password = original.substring(original.lastIndexOf('a'));
		return password;
	}
	
	public void setUsername(String username) {
		//inputusername.sendKeys(username);
		Utility.setText(username, inputusername);
	}
	public void setPassword(String password) {
		//inputpassword.sendKeys(password);
		Utility.setText(password, inputpassword);
	}
	
	public void login() {
		//submitbutton.click();
		Utility.elementClick(submitbutton);
	}
	
}

