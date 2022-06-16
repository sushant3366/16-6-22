package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Your')]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Please')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Please')]")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();



		
		
		
}
}