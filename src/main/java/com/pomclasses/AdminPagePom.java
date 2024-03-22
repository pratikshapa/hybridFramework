package com.pomclasses;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableBiMap.Builder;
import com.hybrid.AdminBase;
import com.hybrid.Base;

public class AdminPagePom extends AdminBase{
	
	public AdminPagePom() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//p[text()='Username : Admin']") private WebElement username;
	
		@FindBy(xpath="//p[text()='Password : admin123']") private WebElement password;
	
		@FindBy(xpath="//input[@name='username']") private WebElement inputusername;
	
		@FindBy(xpath = "//input[@name='password']") private WebElement inputpassword;
	
	    @FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
	    
	    @FindBy(xpath="//input[@placeholder='Search']") private WebElement search;
	    @FindBy(xpath="//a[@class='oxd-main-menu-item active']") private WebElement admin;
		@FindBy(xpath="//span[text()='Job ']") private WebElement job;
	    @FindBy(xpath="//a[text()='Job Titles']") private WebElement jobTitles;
	    @FindBy(xpath="(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]") private WebElement checkjobTitles;
	    
	    
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
			inputusername.sendKeys(username);
		}
		public void setPassword(String password) {
			inputpassword.sendKeys(password);
		}
		
		public void login() {
			submitbutton.click();
		}
		
		public void search() {
			search.sendKeys("Admin");
		}
		public void adminClick() {
			act.doubleClick(admin)
			.build()
			.perform();
		}
	    
		public void job()
	  {
		  act.click(job)
		  .build()
		  .perform();
		  
	  }
	  public void jobtitles()
	  {
		  jobTitles.click();
	  }
	  public void checkjobTitles()
	  {
		  checkjobTitles.click();
	  }
	
	 
	 /* @FindBy(xpath="//input[@placeholder='Search']") private WebElement userName;
	  @FindBy(xpath="//div[@class='oxd-form-actions']") private WebElement userRole;
	  @FindBy(xpath="//input[@placeholder='Type for hints...']") private WebElement EmployeeName;
	  public void setUsername(String username)
	  {
		  userName.sendKeys(username);
	  }
	  public void userrole()
	  {
		  userRole.click();
	  }
	  public void setEmployeeName(String employeename)
	  {
		  EmployeeName.sendKeys(employeename);
	  }*/
	 

	
	
}
