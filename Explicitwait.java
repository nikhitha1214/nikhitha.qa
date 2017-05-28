package pack;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		
		dr.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		dr.findElement(By.id("H-destination")).sendKeys("nyc");
		dr.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		dr.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(dr,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='25906']/div[2]/div/a")));
		
		dr.findElement(By.xpath(".//*[@id='25906']/div[2]/div/a")).click();
		
				
	}

}
