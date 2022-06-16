package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContain_Using_Attribute 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("sushant99399");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pas')]")).sendKeys("xyz");  //no need of typing full attribute value
		driver.findElement(By.xpath("//button[contains(@type,'s')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}