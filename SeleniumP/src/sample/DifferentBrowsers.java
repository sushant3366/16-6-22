package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers 
{
	public static void main(String[] args) 
	{
		//step1: set path of chromedriver.exe file
				//parameter1: name of the browser(small letter)
				//parameter2: path of the browser
	    	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromedriver_win32\\chromedriver.exe");
//		
//		//step2: create an object of ChromeDriver class
//		ChromeDriver deiver=new ChromeDriver();
//		
//		
		//For Firefox browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\firefox driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		//For MicrosoftEdge browser
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\Edge driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();
	}
	
}
