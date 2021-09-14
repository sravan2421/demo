package com.Racto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Racto.GenricLiib.Basetest;

public class CreatedCampaignPage {
 
       @FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement campaigntb;
       @FindBy(xpath="//input[@value=\"Save\"][1]") private WebElement Savebtn;
       
      public CreatedCampaignPage()
      {
    	  PageFactory.initElements(basetest.driver, this);
      }
      
      public void createCampaignWithMandatoryDetails(String CampaignName )
      {
    	  campaigntb.sendKeys(CampaignName);
    	  Savebtn.click();
    	  
    	  
      }
      
      
      

}
