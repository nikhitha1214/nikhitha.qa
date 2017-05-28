package pack;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

public class Misc {

	public static void main(String[] args) throws IOException {
		
		/* Handling https certificates
		 * FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver dr = new ChromeDriver(prof);*/

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		/*dr.get("http://www.google.com");
		Set<Cookie> cookies = dr.manage().getCookies();
		System.out.println(cookies.size());
		
		
		dr.manage().deleteAllCookies();
		Set<Cookie> delcookies = dr.manage().getCookies();
		System.out.println(delcookies.size());*/
		
		
		
		
		//dr.manage().deleteAllCookies();
		//dr.manage().window().maximize();
		
		//WindowsUtils.killByName("notepad.exe");
		
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\screenshot.png"));
		
		
		
	

	}

}
