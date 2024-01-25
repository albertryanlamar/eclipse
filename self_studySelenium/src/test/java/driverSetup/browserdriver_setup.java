package driverSetup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import endpoints.urlList;
import io.github.bonigarcia.wdm.WebDriverManager;


public class browserdriver_setup 
{
	
	public static WebDriver drive_e;
	public static urlList ulist;
	
	//setup browser BDD style
	
	public static void setupBrowser(String browser) 
	{
		ulist = new urlList();
	    
	   
	   if(browser.equalsIgnoreCase("Chrome")) {
		   //1st way 
		  // System.setProperty("chromesetupto",url );//call the driver of the browser chrome
		   // other way using webdriver manager
		   WebDriverManager.chromedriver().setup();
		   drive_e = new ChromeDriver();
		   drive_e.get(ulist.url_ni_scr);
	   }
	   
	   else if(browser.equalsIgnoreCase("Edge")) {
		   //System.setProperty("chromesetupto",url);//call the driver of the browser edge
		   drive_e = new EdgeDriver();
		   
	   }
	}
}
 