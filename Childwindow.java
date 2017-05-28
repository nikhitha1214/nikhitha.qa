package pack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://accounts.google.com/SignUp?hl=en");
		dr.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(dr.getTitle());
		
		// identifying the parent and child windows
		Set<String> id = dr.getWindowHandles();
		Iterator<String> itr = id.iterator();
		String parent = itr.next();
		String child = itr.next();
		
		//switching to child
		dr.switchTo().window(child);
		System.out.println(dr.getTitle());
		
		// switching back to parent
		dr.switchTo().window(parent);
		System.out.println(dr.getTitle());

	}

}
