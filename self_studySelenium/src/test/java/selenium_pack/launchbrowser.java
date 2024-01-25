package selenium_pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverSetup.browserdriver_setup;
import endpoints.urlList;
import io.github.bonigarcia.wdm.WebDriverManager;


public class launchbrowser {
	
	public static urlList ulist;
	public static browserdriver_setup ase;
	
   public static void main(String[] args) {
	   
	   ulist = new urlList();
	   ase = new browserdriver_setup();
	     
	   ase.setupBrowser("Chrome");
	   ase.drive_e.manage().window().maximize();
	   
	   //how to get the Title of the webapplication
	   String urltitle = ase.drive_e.getTitle();
	   System.out.println(urltitle);
	   
	   // get the current url
	 
	   String curl = ase.drive_e.getCurrentUrl();
	   System.out.println(curl);
	   
	   
	   WebElement txtmsidn = ase.drive_e.findElement(By.id("otpMsisdnInput"));
	   txtmsidn.sendKeys("9270992492");
	   
	   WebElement btnregister = ase.drive_e.findElement(By.className("go_sc-otp__get-code-btn"));
	   btnregister.click();
	   
	   //WebElement btnproceed = ase.drive_e.findElement(By.className("//button[text()='Proceed']"));
	  // btnproceed.click(); 
	   

	   
	   

	   
   }
}
