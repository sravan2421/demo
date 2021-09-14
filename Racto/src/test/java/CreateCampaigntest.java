

import Racto.GenricLiib.Basetest;
import Racto.GenricLiib.FileLib;
import Racto.GenricLiib.WebDriverCommonLib;
import Racto.pages.CreatedCampaignPage;
import Racto.pages.CustomViewpage;
import Racto.pages.HomePage;
import Racto.pages.LoginPage;

public class CreateCampaigntest  extends Basetest {
	
	public static void main (String [] args) throws Throwable {
		
		Basetest bt= new Basetest();
		bt.openBrowser();
		 Thread.sleep(4000);
		 FileLib Flib =new FileLib();
	   LoginPage lp = new LoginPage();
	   
	   lp.loginToApp(Flib.readPropertyData(PROP_PATH,"username"), Flib.readPropertyData(PROP_PATH, "password"));
	   Thread.sleep(2000);
	   WebDriverCommonLib wlib =new WebDriverCommonLib();
	   wlib.verify(wlib.getPageTitle(),Flib.readPropertyData(PROP_PATH,"hometitle"), "Home page");
	   
	   Thread.sleep(2000);
	   HomePage hp = new HomePage();
	   hp.clickcampaintab();
	   

	wlib.verify(wlib.getPageTitle(),Flib.readPropertyData(PROP_PATH, "CustomviewTitle "),"customViewPage" );
	
	 Thread.sleep(2000);
	   CustomViewpage cv = new CustomViewpage();
	   cv.clickNewCampainbtn();
	   
		wlib.verify(wlib.getPageTitle(),Flib.readPropertyData(PROP_PATH, "CreateCampaignTitle "),"CreateCampaignPage" );

		CreatedCampaignPage cm =new CreatedCampaignPage();
		cm.createCampaignWithMandatoryDetails(Flib.readExcelData(EXCEL_PATH, "campaign", 0, 1));
//		Flib.readExcelData(EXCEL_PATH, "Campaign", 0, 1);
//		
		
		wlib.verify(wlib.getPageTitle(), Flib.readPropertyData(PROP_PATH, "CampaignDetailsTitle"), "CampaignDeatilsPage");
	}
	
	
    
}
