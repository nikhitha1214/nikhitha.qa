package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.echoecho.com/htmlforms10.htm");
		//dr.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//System.out.println(dr.findElements(By.xpath("//input[@name='group1']")).size());
		
		
		int count = dr.findElements(By.xpath("//input[@name='group1']")).size();
		/*
		for(int i=0;i<count; i++){
			dr.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		 */
		for(int i=0;i<count; i++){
			String text = dr.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Milk")){
			dr.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
	}

	}}
