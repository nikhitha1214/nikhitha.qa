package pack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
	
		
		String baseUrl="https://disneyworld.disney.go.com/tickets/";
		dr.get(baseUrl);
		
		dr.findElement(By.xpath(".//*[@id='radioRateCarouselid-base']/div/div/div/span/div")).click();
			
		dr.findElement(By.xpath(".//*[@id='pepDayScroller_numDays']/div[2]/a/div[2]")).click();
		
		dr.findElement(By.xpath(".//*[@aria-label='Add Adults count to mix']")).click();
		
		dr.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]")).click();
		
		
		
		
		
	}

}
