package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.amazon.com");
		
		Actions a = new Actions(dr);
		//a.moveToElement(dr.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).build().perform();
		a.moveToElement(dr.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("nikki").doubleClick().build().perform();
		a.moveToElement(dr.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).contextClick().build().perform();
		
	}

}
