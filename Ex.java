package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
	
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String baseUrl="https://disneyworld.disney.go.com/tickets/";
		dr.get(baseUrl);
		
		//dr.findElement(By.xpath(".//*[@id='radioRateCarouselid-base']/div/div/div/div/span/div")).click();
		dr.findElement(By.xpath(".//*[@id='pepDayScroller_numDays']/div[1]/a")).click();
		dr.findElement(By.xpath(".//*[@id='1-day-ThemePark-calendar']/div[2]/table/tbody/tr[5]/td[4]/a")).click();
		
		dr.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")).click();
		
		dr.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]")).click();		
		dr.findElement(By.xpath(".//*[@id='addToCart']")).click();	
	}

}
