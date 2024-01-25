package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigations {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driveTo = new ChromeDriver();
		
		driveTo.get("https://www.facebook.com/");
		driveTo.get("https://www.instagram.com/");
		
		driveTo.navigate().back();// will go back to facebook page
		driveTo.navigate().forward();//will go to insta page
		
		driveTo.navigate().refresh();// refresh/reload the current page
		driveTo.navigate().to("https://www.facebook.com/"); // same as get() method
		
		

	}

}
