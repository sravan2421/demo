package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest implements IAutoConsts {
       public static WebDriver driver;
       public void openBrowser() throws Throwable
       {
    	  FileLib flib = new FileLib();
    	  String browsername =flib.readPropertyData(PROP_PATH,"browser");
    	  if (browsername.equals("chrome")) {
    		 System.setProperty(CHROME_KEY,CHROME_VALUE); 
    	  driver =new ChromeDriver();
    	  }
        
    	  else if (browsername.equals("firefox")) {
    	   System.setProperty(GECKO_KEY,GECKO_VALUE);
    	  driver  = new FirefoxDriver();
       } else {
    	   System.out.println("enter proper browser name");
    	  
       }
       driver.manage().window().maximize();
       String appURL = flib.readPropertyData(PROP_PATH,"url");
       driver.get(appURL);
       Thread.sleep(3000);
      WebDriverCommonLib  wlib = new WebDriverCommonLib();
      String expectedLoginTitle = flib.readPropertyData(PROP_PATH,"LoginTitle");
      wlib.verify(wlib.getPageTitle(),expectedLoginTitle,"Login Page");
      }
      
      
      public void closebrowser()
      {
    	  driver.quit();
      }
       
       
       


     
     
}
