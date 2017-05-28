package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Implicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		dr.findElement(By.id("H-destination")).sendKeys("nyc");
		dr.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		dr.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		dr.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Courtyard-New-York')]")).click();
		
				
	}

}
