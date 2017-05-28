package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
		System.out.println(dr.getPageSource());
		System.out.println(dr.getTitle());
		dr.close();
	}

}
