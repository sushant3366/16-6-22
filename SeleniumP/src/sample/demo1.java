package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);                      // wait for 3seconds
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		
		
		
		
		
		
//		driver.close();    // tp close current tab of browser
//		driver.quit();     // to close all the tabs present in  browser

	}
}
