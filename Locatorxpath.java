package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		

	}

}
