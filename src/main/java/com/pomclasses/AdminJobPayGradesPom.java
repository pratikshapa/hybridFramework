package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.Base;

public class AdminJobPayGradesPom extends Base {
	
	public  AdminJobPayGradesPom()
	{
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="") private WebElement job;
	@FindBy(xpath="") private WebElement payGrades;
	
	

}
