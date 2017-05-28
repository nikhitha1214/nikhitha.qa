package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhitha\\Desktop\\TESTING\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//dr.manage().window().maximize();
		dr.get("https://www.ebay.com");
		
		System.out.println("total links in the entire page");
		System.out.println(dr.findElements(By.tagName("a")).size());
		
		System.out.println("links in the footer section of the page");
		WebElement footer = dr.findElement(By.id("glbfooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		System.out.println("links in the second column footer section of the page");
		WebElement column2 = footer.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(column2.findElements(By.tagName("a")).size());
		
		System.out.println("names of links in the second column footer section of the page");
		String beforeclicking=null, afterclicking;
		for(int i=0; i<=column2.findElements(By.tagName("a")).size(); i++)
		{
			//System.out.println(column2.get(i).getText());
			
			System.out.println(dr.getTitle());
			beforeclicking = dr.getTitle();
			
			if(column2.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				
				System.out.println("clicking on the last link (site map)");
				column2.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		System.out.println(dr.getTitle());
		afterclicking = dr.getTitle();
		if(beforeclicking != afterclicking)
		{
			boolean statusoftext = dr.findElement(By.xpath(".//*[@id='buy']/div[1]/h3")).isDisplayed();
			if(statusoftext==true)
			System.out.println("PASS");
			
		}else{
			System.out.println("FAIL");
		}
		
	}

}
