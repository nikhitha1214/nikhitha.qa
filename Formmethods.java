package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formmethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.makemytrip.com");
		//isEnabled()
		//isSelected()
		//getText()
		/*System.out.println(dr.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		dr.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
		System.out.println(dr.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		*/
		//System.out.println(dr.findElement(By.xpath("html/body/div[1]/section/div/div[1]/h2")).getText());
		
		int count = dr.findElements(By.xpath(".//*[@id='js-switch__optio']/div[3]/label")).size();
		if(count==0){
			System.out.println("verified");
		}
	}

}
