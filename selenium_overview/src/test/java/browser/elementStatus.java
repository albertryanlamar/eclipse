package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementStatus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();// no need to paste the path of the chrome driver needed or no need to setup browser
		 WebDriver driverko1 = new ChromeDriver();
		 driverko1.get("https://demo.nopcommerce.com/register");
	
		 //isDisplayed() and isEnabled();
		 
		 WebElement txtsearch = driverko1.findElement(By.xpath("//input[@id='small-searchterms']"));
		 boolean a = txtsearch.isDisplayed();
		 boolean b = txtsearch.isEnabled();
		 System.out.println(a +" "+ b);
		 
		 WebElement rb_male = driverko1.findElement(By.xpath("//input[@id='gender-male']"));
		 WebElement rb_fmale = driverko1.findElement(By.xpath("//input[@id='gender-female']"));
		 boolean c = rb_male.isSelected();//false
		 boolean d = rb_fmale.isSelected();//false	 
		 System.out.print(c +" "+ d);
		 
		 rb_male.click();
		 System.out.print(rb_male.isSelected());//true
		 System.out.print(rb_fmale.isSelected());//false

		 
		 
		 /*
		 WebElement txtnum = driverko1.findElement(By.xpath("//input[@id='otpMsisdnInput']"));
		 boolean a = txtnum.isDisplayed();
		 boolean b = txtnum.isEnabled();
		 System.out.print(a +" "+ b);
		 if(a && b) {
			 txtnum.sendKeys("9270992492");
		 }
		 else {
			 a=false;
			 b=false;
		 }
		 */
		 	

	}
}
