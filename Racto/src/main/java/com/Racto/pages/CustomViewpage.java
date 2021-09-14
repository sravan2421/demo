package com.Racto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Racto.GenricLiib.Basetest;

public class CustomViewpage {

	@FindBy(xpath ="//input[@value=\"New Campaign\"]") private WebElement NewCampainbtn;
	
	public CustomViewpage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	
	public void clickNewCampainbtn()
	{
		NewCampainbtn.click();
	  
	}
}
