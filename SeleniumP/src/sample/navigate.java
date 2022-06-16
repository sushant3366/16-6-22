package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();	
		System.out.println(url);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		}
		
}
