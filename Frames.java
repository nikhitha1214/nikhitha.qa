package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://jqueryui.com/droppable/");
		
		dr.switchTo().frame(dr.findElement(By.className("demo-frame")));
		
		Actions a = new Actions(dr);
		WebElement source = dr.findElement(By.id("draggable"));
		WebElement target = dr.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();

	}

}
