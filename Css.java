package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://login.salesforce.com/");
		dr.findElement(By.cssSelector("[id='username']")).sendKeys("hfjdjdssfhkj");
		dr.findElement(By.cssSelector("[id='password']")).sendKeys("1234");
		dr.findElement(By.xpath("//*[@value='Log In']")).click();

	}

}
