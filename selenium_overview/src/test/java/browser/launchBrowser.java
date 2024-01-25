package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/****** First way to lunch browser ********/
		//syntax System.setProperty(<key(kahit pede mo iname)>,<url path nung driver>);
		/*
		 System.setProperty("chromedriver","C:\\Users\\WSI\\Downloads\\Browser Driver\\chromedriver.exe");
		 WebDriver driverko = new ChromeDriver();//assign an instance of chromedriver as driverko and lunch your browser
		 driverko.get("https://www.facebook.com/");//lunch your appliction/go to your web application url
		 
		 */
		 
		 
		 /****** other way to lunch browser by using webdrivermanager ********/
		
		/****** chrome browser ********/
		 WebDriverManager.chromedriver().setup();// no need to paste the path of the chrome driver needed or no need to setup browser
		 WebDriver driverko1 = new ChromeDriver();
		 
		/****** fire fox browser ********/
		 //WebDriverManager.firefoxdriver().setup();
		 //WebDriver driverko1 = new FirefoxDriver();
		  
		 /****** edge browser ********/
		 //WebDriverManager.edgedriver().setup();
		 //WebDriver driverko1 = new EdgeDriver();
		 
		 /****** safari browser ********/
		 //WebDriverManager.safaridriver().setup();
		 //WebDriver driverko1 = new SafariDriver();

		 driverko1.get("https://www.facebook.com/");
		 
		 /****** To get the title of the Web Application ********/
		 String webtitle = driverko1.getTitle();
		 System.out.print(webtitle);
		 
		 /****** To get the Current Url of the Web Application ********/
		 String c_url = driverko1.getCurrentUrl();
		 System.out.print(c_url );
		 
		 /****** To get the Page Source:(html) of the Web Application ********/
		 String pagesourc = driverko1.getPageSource();
		 System.out.print(pagesourc);
		 
		 
		 	

	}

}
