package com.Racto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Racto.GenricLiib.Basetest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Campaigns']")private WebElement campaintab;
	
	public HomePage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public void clickcampaintab()
	{
		campaintab.click();
	}
}
