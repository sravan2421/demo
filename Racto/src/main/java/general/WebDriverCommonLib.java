package general;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {
  

	public String getPageTitle() {
		String PageTitle = Basetest.driver.getTitle();
		return PageTitle;
	}


	public void verify(String actual, String expected, String page) {
		 if(actual.equals(expected)) {
			 System.out.println(page +"is displayed,pass");
		 }else {
			 System.out.println(page +"is not displayed,Fail");
			 
		 }
	 }
    public void selectoption(WebElement element,String value, int index) 
    {
    	 Select sel= new Select(element);
    	 sel.selectByIndex(index);
    }
    
    public void selectOption(WebElement element,String value) {
       Select sel = new Select(element);
	sel.selectByValue(value);
    }
}
	 



