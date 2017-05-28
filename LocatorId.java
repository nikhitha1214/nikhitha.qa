package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorId {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys("haiiiiiiiii");
		dr.findElement(By.name("pass")).sendKeys("nikki");
		//dr.findElement(By.linkText("Forgot account?")).click();
		dr.findElement(By.partialLinkText("Forgot ")).click();
		//dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
	}

}

