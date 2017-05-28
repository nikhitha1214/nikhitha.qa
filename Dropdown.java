package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://spicejet.com/");
		Select s = new Select(dr.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		s.selectByValue("3");
		s.selectByIndex(3);
		s.selectByVisibleText("1");
		
		dr.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		dr.findElement(By.xpath("//a[@value='HYD']")).click();
		dr.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
	}

}
